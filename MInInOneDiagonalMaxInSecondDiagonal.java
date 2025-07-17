package LogicWhile;
import java.util.Scanner;

public class MInInOneDiagonalMaxInSecondDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<m;j++){
                if(i==j && a[i][j]>max){
                    
                        max=a[i][j];
                    
                }
                if (i+j==n-1 && a[i][j]<min) {
                        min=a[i][j];
                    
                }
            }
        }
        System.out.println(max+" "+min);

    }
}
