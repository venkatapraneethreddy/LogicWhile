package LogicWhile;
import java.util.Scanner;

public class MagicNumber {   //sum of all digits is 1

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
        if(n==1) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("no");
        }
        sc.close();
    }
}
