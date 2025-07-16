package LogicWhile;

import java.util.Scanner;

public class MaxProfit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int minPrice = a[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            int profit = a[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (a[i] < minPrice) {
                minPrice = a[i];
            }
        }

        System.out.println(maxProfit);
        sc.close();
    }
}
