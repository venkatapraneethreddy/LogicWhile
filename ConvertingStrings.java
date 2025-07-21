package LogicWhile;

public class ConvertingStrings {
	
	
    public static void main(String[] args) {
        String str = "Java123";

        // 1. To char array
        char[] chars = str.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 2. To byte array
        byte[] bytes = str.getBytes();
        System.out.print("Bytes: ");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();

        // 3. Parse integer
        String numStr = "123";
        int num = Integer.parseInt(numStr);
        System.out.println("Parsed Integer: " + num);
    }
}