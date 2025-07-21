package LogicWhile;
import java.util.Scanner;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Logic");
        sb.append(" While");
        System.out.println("After append: " + sb);
        sb.insert(6, " and");
        System.out.println("After insert: " + sb);
        sb.replace(0, 5, "Loop");
        System.out.println("After replace: " + sb);
        sb.delete(4, 8);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        String result = sb.toString();
        System.out.println("Final string: " + result);
    }
}
