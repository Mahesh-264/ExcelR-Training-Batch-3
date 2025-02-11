import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if(isPalindrome(a)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    public static boolean isPalindrome(int x){
        if(x < 0){
            System.out.println("Enter a number above 0");
        }
        int reversed = 0;
        int original = x;
        while(x > 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        return original == reversed;
    }
}