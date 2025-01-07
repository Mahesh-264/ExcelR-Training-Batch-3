import java.util.Scanner;

public class Demo017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int number = sc.nextInt();
        int tens = number / 10;
        int ones = number % 10;
        int sum = tens + ones;
        System.out.println("The sum of the digits is: " + sum);
    }
}
