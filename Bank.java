package LogicWhile;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int balance = 0;
		while(true)
		{
			System.out.println("Choose the mode of operation /n 1-Deposit/n2-Withdraw/n3-Check balance/n4-Interest");
			int choice = input.nextInt();
			int tranactionAmount = 0;
			switch(choice)
			{
			case 1:tranactionAmount = input.nextInt();
			if(tranactionAmount > 0) balance+= tranactionAmount;
				break;
			case 2:tranactionAmount = input.nextInt();
			if(tranactionAmount > 0 && balance > tranactionAmount) balance-= tranactionAmount;
				break;
			case 3:System.out.println(balance);
				break;
			case 4:int mon = input.nextInt();
			double interest = balance*mon*0.04;
			balance += interest;
			System.out.println("Balance "+balance+"interest "+interest);
				break;
//			case 5 : break;
			default:System.out.println("Invalid");
			}
			System.out.println("Do you want to continue(y/n):");
			String ex = input.next();
			if(ex.equals("n"))break;
		}
		input.close();
	}

}
