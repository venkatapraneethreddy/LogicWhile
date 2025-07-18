package LogicWhile;
import java.util.Arrays;
import java.util.Scanner;

public class ColumnWiseSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }    

        for (int j = 0; j < m; j++) {
            int[] col = new int[n];

            for (int i = 0; i < n; i++)
                col[i] = a[i][j];

            Arrays.sort(col);

            for (int i = 0; i < n; i++)
                a[i][j] = col[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}

