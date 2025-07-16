package LogicWhile;
import java.util.Scanner;

public class YearMonthWeekDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int years=n/365;
		int months=n%365/30;
		int weeks=n%365%30/7;
		int days=n%365%30%7;
		
		System.out.println(years+" "+months+" "+weeks+" "+days);
		sc.close();
	}

}
