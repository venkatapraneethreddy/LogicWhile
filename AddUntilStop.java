package LogicWhile;
import java.util.Scanner;

public class AddUntilStop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			System.out.println("sum="+(m+n));
			System.out.println("y/n");
//			String c=sc.next();
//			if(!c.equalsIgnoreCase("y")) {
//				break;
//			}
			char ch=sc.next().charAt(0);
			if(ch!='y') {
				break;
			}
		}
		sc.close();
	}

}
