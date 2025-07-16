package LogicWhile;
import java.util.Scanner;

public class ArrayEvenOddDifference {
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int evenSum=0;
        int oddSum=0;
        
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	if(a[i]%2==0) {
        		evenSum+=a[i];
        	}
        	else {
        		oddSum+=a[i];
        	}
        }
  
        System.out.println(evenSum-oddSum);
        odd(a,n);
       sc.close();
    }
    static void odd(int a[],int n) {
    	int evenSum=0;
    	int oddSum=0;
    	for(int i=0;i<n;i++) {
    		if(i%2==0) {
    			evenSum+=a[i];
    		}
    		else {
    			oddSum+=a[i];
    		}
    	}
    	System.out.println(evenSum-oddSum);
    }
}
