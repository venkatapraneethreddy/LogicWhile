package LogicWhile;
import java.util.Scanner;

public class StrongNumber {
    // A number is a Strong Number if the sum of the factorial of its digits is equal to the number itself.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += factorial(digit);
                num /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
