package LogicWhile;

public class STringMethods {
     public static void main(String[] args) {
        String str = "Logic While";
        String str2 = "logic while";

        System.out.println("Original string: '" + str + "'");

        System.out.println("length(): " + str.length());
        System.out.println("charAt(1): " + str.charAt(1));
        System.out.println("substring(2): '" + str.substring(2) + "'");
        System.out.println("substring(2, 7): '" + str.substring(2, 7) + "'");
        System.out.println("toLowerCase(): '" + str.toLowerCase() + "'");
        System.out.println("toUpperCase(): '" + str.toUpperCase() + "'");
        System.out.println("trim(): '" + str.trim() + "'");
        System.out.println("equals(): " + str.equals(str2));
        System.out.println("equalsIgnoreCase(): " + str.equalsIgnoreCase(str2));
        System.out.println("compareTo(): " + str.compareTo(str2));
        System.out.println("contains(\"While\"): " + str.contains("While"));
        System.out.println("replace('i', '*'): '" + str.replace('i', '*') + "'");
        
        String[] parts = str.trim().split(" ");
        System.out.println("split(\" \"): First word = '" + parts[0] + "', Second word = '" + parts[1] + "'");
        
        System.out.println("indexOf(\"i\"): " + str.indexOf("i"));
        System.out.println("lastIndexOf(\"i\"): " + str.lastIndexOf("i"));
        System.out.println("startsWith(\"Log\"): " + str.startsWith("Log"));
        System.out.println("endsWith(\"ile\"): " + str.endsWith("ile"));
    }
}
