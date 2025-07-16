package LogicWhile;
import java.util.Scanner;

public class ParkingLot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ic=50;
		int c=20;
		if(n<=0) {
			System.out.println("Invalid");
		}
		else if(n<=2) {
			System.out.println("Total charge is "+ic+"rupees");
		}
		else if(n>2) {
			System.out.println("Total charge is "+(ic+(n-2)*c)+"rupees");
		}
		sc.close();
	}

}
