import java.util.Scanner;

public class Demo056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int CompleteNum = sc.nextInt();
        int Sum_cube_Each_digit = 0;

        while (CompleteNum > 0) {
            int eachDigit = CompleteNum % 10;
            Sum_cube_Each_digit += eachDigit * eachDigit * eachDigit;
            CompleteNum = CompleteNum / 10;
        }

        System.out.println("The final output: " + Sum_cube_Each_digit);

        sc.close();
    }
}