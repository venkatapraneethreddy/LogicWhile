package LogicWhile;
import java.util.Scanner;

public class JumpingNumberCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n < 10) {
            System.out.println("yes");
            return;
        }

        int prevDigit = n % 10;
        n /= 10;
        boolean isJumping = true;

        while (n > 0) {
            int currDigit = n % 10;
            if (Math.abs(currDigit - prevDigit) != 1) {
                isJumping = false;
                break;
            }
            prevDigit = currDigit;
            n /= 10;
        }

        if (isJumping) {
            System.out.println("yes");
        } 
        else {
            System.out.println("no");
        }
    }
}
