package LogicWhile;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			a[i]%=2;
		}
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
