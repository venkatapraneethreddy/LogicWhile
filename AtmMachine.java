package LogicWhile;
import java.util.Scanner;
public class AtmMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int amount = input.nextInt();
		int fh = amount/500;
		int th = amount%500/200;
		int oh = amount%500%200/100;
		
		if(fh > 0)
			System.out.println("500 notes are "+fh);
		if(th > 0)
			System.out.println("200 notes are "+th);
		if(oh > 0)
			System.out.println("100 notes are "+oh);
		input.close();
//		System.out.println("500 notes are"+amount/500+"/n");

	}

}
