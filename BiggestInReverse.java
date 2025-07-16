package LogicWhile;
import java.util.Scanner;

public class BiggestInReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int m=sc.nextInt();
		int temp1=n;
		int temp2=m;
		int rev1=0,rev2=0;
		while(temp1!=0) {
			int d=temp1%10;
			rev1=rev1*10+d;
			temp1/=10;
		}
		while(temp2!=0) {
			int d1=temp2%10;
			rev2=rev2*10+d1;
			temp2/=10;
		}
		if(rev1>rev2) {
			System.out.println(rev1);
		}
		else {
			System.out.println(rev2);
		}
		sc.close();
	}

}
