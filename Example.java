package LogicWhile;

public class Example {
	
	
    public static void main(String[] args) {
       String s1="java";
	   String s2="program";
	   s1.concat(s2);
	   System.out.println(s1);
	   s1=s1.concat(s2);
	   System.out.println(s1);
	   System.out.println(s1.compareTo(s2));
    }
}