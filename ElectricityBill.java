package LogicWhile;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int units = input.nextInt();
		double charge = 0;
		if(units > 300) {
			charge += (units-300)*5;
			units = 300 ;
			}
		if(units > 200) {
			charge += (units-200)*3;
			units = 200 ;
			}
		if(units > 100) {
			charge += (units-100)*2;
			units = 100 ;
			}
		if(units > 0)
			charge += units*1.5;
		else {
			System.out.println("Invalid");
		}
		System.out.println(charge);

		charge = 25 + charge*105/100;
		if(charge > 500)	charge *= 0.95;
		System.out.println(charge);
		input.close();	
	}

}
