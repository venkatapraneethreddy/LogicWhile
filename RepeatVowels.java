package LogicWhile;

public class RepeatVowels{
    public static void main(String[] args) {
        String str = "Hello".toLowerCase();
        String result  ="";
        for(int i = 0;i < str.length();i++){
            if("aeiou".indexOf(str.charAt(i)) != -1){
                for(int j = 0 ;j < i;j++){
                    result+=str.charAt(i);
                }
                
            }result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
