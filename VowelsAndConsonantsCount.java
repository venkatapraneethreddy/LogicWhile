package LogicWhile;
import java.util.Scanner;

public class VowelsAndConsonantsCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int Vcount=0,Ccount=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                Vcount++;
            }
            else if(s.charAt(i)==' '){
                continue;
            }
            else{
                Ccount++;
            }
        
        }
        System.out.println("Vowels:"+Vcount+" "+"Consonants:"+Ccount);
    }
    
}
