package LogicWhile;
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int count = 0;
        int num = 1;

        while (true) {
            int sum = 0;

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                count++;
                if (count == m) {
                    System.out.println(num);
                    break;
                }
            }

            num++;
        }
        sc.close();
    }
}
