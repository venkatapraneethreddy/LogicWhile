package LogicWhile;
import java.util.Scanner;

public class AlternateRowBorderElementSUm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        for(int i=n-1;i>=0;i-=2){
            for(int j=0;j<m;j++){
                if(i%2==0){
                    
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
