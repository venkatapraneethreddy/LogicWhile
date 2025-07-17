package LogicWhile;
import java.util.Scanner;

public class DiagonalSumDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int d1sum=0;
        int d2sum=0;
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<m;j++){
                if(i==j){
                    d1sum+=a[i][j];
                }
                if (i+j==n-1) {
                    d2sum+=a[i][j];
                }
            }
        }
        System.out.println(d2sum-d1sum);

    }
}
