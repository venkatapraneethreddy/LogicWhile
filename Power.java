package LogicWhile;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp = n;
		int count=0;
		int sum =0;
		while(n !=0) {
//			int digit=n%10;
			n=n/10;
			count++;
//			sum+=Math.pow(digit,count);
		}
//		System.out.println(sum);
		
		while(temp != 0)
		{
			sum += Math.pow(temp%10, count--);
			temp/=10;
		}
		System.out.println(sum);
		
		
		sc.close();

	}

}
