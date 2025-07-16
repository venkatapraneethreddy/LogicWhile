package LogicWhile;
import java.util.Scanner;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int maxCount=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]==1) {
				count++;
				if(count >maxCount)
				maxCount=count;
			}
			else {
				count=0;
			}
		}
		System.out.println(maxCount);
		sc.close();
	}

}
