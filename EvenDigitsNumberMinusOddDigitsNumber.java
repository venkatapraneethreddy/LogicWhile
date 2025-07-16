package LogicWhile;
import java.util.Scanner;

public class EvenDigitsNumberMinusOddDigitsNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String odd="";
		String even="";
		int temp=n;
		while(temp>0) {
			int digit=temp%10;
			if(digit%2==0) {
				even=digit+even;
			}
			else {
				odd=digit+odd;
			}
			temp/=10;
		}
		int evenNum =Integer.parseInt(even);
        int oddNum = odd.isEmpty() ? 0 : Integer.parseInt(odd);
        
        int res =evenNum - oddNum;
        System.out.println(evenNum);
        System.out.println(oddNum);
        System.out.println("Even - Odd: " + res);
        sc.close();
	}

}
