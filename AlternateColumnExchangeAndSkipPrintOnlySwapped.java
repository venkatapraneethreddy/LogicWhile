package LogicWhile;
import java.util.Scanner;

public class AlternateColumnExchangeAndSkipPrintOnlySwapped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j + 2 < m; j += 3) {
                System.out.print(a[i][j + 2] + " ");
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
