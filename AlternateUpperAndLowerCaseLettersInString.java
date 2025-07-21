package LogicWhile;

public class AlternateUpperAndLowerCaseLettersInString {
    public static void main(String[] args) {
        String s = "HelloWorld";
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i % 2 == 0) {
                res.append(Character.toLowerCase(ch));
            } else {
                res.append(Character.toUpperCase(ch));
            }
        }

        System.out.print(res.toString());
    }
}
