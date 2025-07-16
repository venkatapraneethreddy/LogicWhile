package LogicWhile;
import java.util.Scanner;

public class BalancedNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int temp = n;
		int count = 0;
		while (temp > 0) {
			count++;
			temp /= 10;
		}

		temp = n;
		int rev = 0;
		while (temp > 0) {
			int d = temp % 10;
			rev = rev * 10 + d;
			temp /= 10;
		}

		int suml = 0, sumr = 0;
		int mid = count / 2;

		for (int i = 0; i < mid; i++) {
			int d = rev % 10;
			suml += d;
			rev /= 10;
		}

		if (count % 2 != 0) {
			rev /= 10;
		}

		for (int i = 0; i < mid; i++) {
			int d = rev % 10;
			sumr += d;
			rev /= 10;
		}

		if (suml == sumr) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		sc.close();
	}
}
