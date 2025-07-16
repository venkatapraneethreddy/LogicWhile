package LogicWhile;

import java.util.Scanner;

public class DisariumNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int temp = n;
		int t=n;
		int count=0;
		int sum =0;
		while(n !=0) {
			n=n/10;
			count++;
		}
		
		while(temp != 0)
		{
			sum += Math.pow(temp%10, count--);
			temp/=10;
		}
		
		if(sum==t) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		

	
		sc.close();

	}	
}


