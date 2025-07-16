package LogicWhile;
import java.util.Scanner;

public class DigitDifferenceDecoder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		int num=0;
		while(temp>0) {
			int d=temp%10;
			rev=rev*10+d;
			temp/=10;
		}
		System.out.print(rev%10);
		
		while(rev>10) {
			int prev=rev%10;
			rev/=10;
			int current=rev%10;
			int d=prev-current;
			int diff=Math.abs(d);
			num=num*10+diff;
			
		}
		System.out.print(num);
		sc.close();
		
	}

}
