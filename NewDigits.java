package LogicWhile;

import java.util.Scanner;

public class NewDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		
		while(n !=0) {
			int digit=n%10;
			System.out.println(digit);
			n=n/10;
			count++;
		}
		System.out.println("count:"+count);
		sc.close();

	}

}
