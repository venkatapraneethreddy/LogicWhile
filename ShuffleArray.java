package LogicWhile;
import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		for(int i=0;i<n/2;i++) {
			b[2*i]=a[i];
			b[(2*i)+1]=a[n/2+i];
		}
		System.out.println(Arrays.toString(b));
		sc.close();
	}

}
