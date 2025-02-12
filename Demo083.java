import java.util.Scanner;
public class Demo083 {
    public static boolean isFirstCharVowel(String A) {
        if (A == null ) {
            return false;
        }else{
        char firstChar = A.toLowerCase().charAt(0);
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String A = sc.next();
        if (isFirstCharVowel(A)) {
            System.out.println("The first character is a vowel.");
        } else {
            System.out.println("The first character is not a vowel.");
        }
    }
}