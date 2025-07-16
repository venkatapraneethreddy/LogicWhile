package LogicWhile;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++) {
		int n=i;
		int temp = n;
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
		
		if(sum==i) {
			System.out.println(i);
		}
		

	}
		sc.close();

	}	
}


