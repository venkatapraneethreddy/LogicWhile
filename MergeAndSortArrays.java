package LogicWhile;
import java.util.Scanner;
import java.util.Arrays;

public class MergeAndSortArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		int c[]=new int[m+n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<m;i++) {
			c[n+i]=b[i];
		}
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		sc.close();

	}

}
