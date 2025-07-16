package LogicWhile;
import java.util.Scanner;

public class AmicablePairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		int sum1=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		for(int i=1;i<m;i++) {
			if(m%i==0) {
				sum1+=i;
			}
		}
		
		if(sum1==n&&sum==m) {
			System.out.println("yes");
		}
		else {
			System.out.println("NO");
		}
		sc.close();
	}

}
