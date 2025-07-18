package LogicWhile;

import java.util.Scanner;

public class ToeplitzMatrixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();

        boolean isToeplitz = true;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (a[i][j] != a[i + 1][j + 1]) {
                    isToeplitz = false;
                    break;
                }
            }
            if (!isToeplitz) break;
        }

        System.out.println(isToeplitz ? "Yes" : "No");
    }
}
