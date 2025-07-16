package LogicWhile;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fine=0;

        if (n>0 && n<=5) {
            fine=n*2;
        } else if(n>5 && n<=10) {
            fine=5*2+(n-5)*3;
        } else if(n>10) {
            fine=5*2+5*3+(n-10)*5;
        } else {
            System.out.println("Invalid input. Days must be positive.");
            sc.close();
            return;
        }

        System.out.println("Total fine is "+fine);
        sc.close();
    }
}
