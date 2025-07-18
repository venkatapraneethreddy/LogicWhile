package LogicWhile;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        int count = 0;
        StringBuilder sb = new StringBuilder("Java Program");

        System.out.print("Consonants: ");
        for (int i = 0; i < sb.length(); i++) {
            char ch = Character.toLowerCase(sb.charAt(i));
            if (sb.charAt(i) != ' ' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
                System.out.print(sb.charAt(i));
            }
        }

        System.out.println();
        System.out.println("Consonant count: " + count);

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            char ch = Character.toLowerCase(sb.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels.append(sb.charAt(i));
                } else {
                    consonants.append(sb.charAt(i));
                }
            }
        }

        String result = vowels.toString() + consonants.toString();
        System.out.println("Vowels + Consonants: " + result);
    }
}
