package LogicWhile;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.equals(a, b));
		int arr[]=Arrays.copyOf(a, n);
		System.out.println(Arrays.toString(arr));
		int array[]=Arrays.copyOfRange(a, 0, n-2);
		System.out.println(Arrays.toString(array));
		Arrays.fill(a, 2);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(arr,2));
		
		int c[][]= {{1,2,3},{4,5,6}};
		int d[][]= {{1,2,3},{4,6,5}};
		System.out.println(Arrays.deepEquals(c,d));
		sc.close();
		
	}

}
