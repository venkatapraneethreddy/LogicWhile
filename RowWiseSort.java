package LogicWhile;

import java.util.Arrays;
import java.util.Scanner;

public class RowWiseSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++)
            Arrays.sort(a[i]);

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m - 1; j++) {
        //         for (int k = j + 1; k < m; k++) {
        //             if (a[i][j] > a[i][k]) {
        //                 int temp = a[i][j];
        //                 a[i][j] = a[i][k];
        //                 a[i][k] = temp;
        //             }
        //         }
        //     }
        // }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
