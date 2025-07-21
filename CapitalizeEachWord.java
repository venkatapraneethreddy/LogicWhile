package LogicWhile;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        String s = "java is a programming language";
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                res.append(Character.toUpperCase(word.charAt(0)))
                   .append(word.substring(1))
                   .append(" ");
            }
        }

        System.out.println(res.toString().trim());
    }
}
