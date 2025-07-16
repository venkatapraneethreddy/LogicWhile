
package LogicWhile;

import java.util.Scanner;

public class EvenDigitInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int count = 0;
		int evenCount = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int temp = a[i];
			count = 0;

			while (temp > 0) {
				count++;
				temp /= 10;
			}

			if (count % 2 == 0) {
				evenCount++;
			}
		}

		System.out.println(evenCount);
		sc.close();
	}
}
