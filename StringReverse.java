package LogicWhile;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        System.out.print(res);
    }
}
