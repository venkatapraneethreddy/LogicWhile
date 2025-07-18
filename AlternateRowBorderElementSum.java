package LogicWhile;
import java.util.Scanner;

public class AlternateRowBorderElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < m; j++) {
                if (j == 0 || j == m - 1) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
