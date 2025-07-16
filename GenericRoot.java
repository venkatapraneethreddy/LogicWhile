package LogicWhile;
import java.util.Scanner;

public class GenericRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n >= 10) {
            int sum = 0;
            int temp = n;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            n = sum;
        }

        System.out.println("Generic Root is: " + n);
        sc.close();
    }
}
