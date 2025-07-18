package LogicWhile;
import java.util.Arrays;
import java.util.Scanner;

public class NumberOfOnesInEachRow {
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
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=a[i][j]%2;
            }
        }
        String s=Arrays.deepToString(a);
        System.out.println(s);
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(a[i][j]==1){
                    count++;
                }
            }
            System.out.println("row"+(i+1)+" "+count);
        }
    }
}
