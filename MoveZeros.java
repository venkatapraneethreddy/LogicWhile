package LogicWhile;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
//		for(int i=0;i<n;i++) {                  //move zeros to last
//			for(int j=i+1;j<n;j++) {
//			if(a[j]==0&&a[i]!=0) {
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//			}
//		}
		for(int i=n-1;i>=0;i--) {                       //move zeros to first
			for(int j=i-1;j>=0;j--) {
				if(a[i]==0&& a[j]!=0) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		sc.close();

	}

}
