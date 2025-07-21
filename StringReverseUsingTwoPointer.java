package LogicWhile;
import java.util.Scanner;

public class StringReverseUsingTwoPointer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char ch[]=s.toCharArray();
    int left=0;
    int right=s.length()-1;
    while(left<right){
        char temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        left++;
        right--;
    }
    String res=new String(ch);
    System.out.println(res);
    }
    
}
