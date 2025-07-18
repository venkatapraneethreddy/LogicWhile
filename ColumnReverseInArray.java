package LogicWhile;

import java.util.Arrays;
import java.util.Scanner;

public class ColumnReverseInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            int top = 0, bottom = n - 1;
            while (top < bottom) {
                int temp = a[top][j];
                a[top][j] = a[bottom][j];
                a[bottom][j] = temp;
                top++;
                bottom--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
