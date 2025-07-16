package LogicWhile;
import java.util.Scanner;

public class MirrorArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2!=0) {
			System.out.println("no");
			System.exit(0);
		}
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(mirror(a,n));
		sc.close();

	}
	
	static boolean mirror(int a[],int n) {
		for(int i=0;i<n/2;i++) {
			if(a[i]==a[n-1-i]) {
				return true;
			}
		}
		return false;
	}

}
