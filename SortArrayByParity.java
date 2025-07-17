import java.util.Scanner;

public class SortArrayByParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                result[index++] = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                result[index++] = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
