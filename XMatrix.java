package LogicWhile;
import java.util.Scanner;

public class CheckXMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if ((i == j || i + j == n - 1) && a[i][j] == 0 || 
                    (i != j && i + j != n - 1 && a[i][j] != 0)) {
                    System.out.println("Not an X Matrix");
                    return;
                }
            }

        System.out.println("X Matrix");
    }
}
