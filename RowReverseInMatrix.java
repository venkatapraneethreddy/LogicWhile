package LogicWhile;
import java.util.Arrays;
import java.util.Scanner;

public class RowReverseInMatrix {
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

        for (int i = 0; i < n; i++) {
            int left = 0, right = m - 1;
            while (left < right) {
                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
