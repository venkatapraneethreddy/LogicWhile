package LogicWhile;
import java.util.Scanner;

public class LargestMinusSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int large=0;
		for(int i=0;i<n/2;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		int small=a[n/2];
		for(int i=n/2;i<n;i++) {
			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println(large+" "+small);
		System.out.println(large-small);
		sc.close();
	}

}
