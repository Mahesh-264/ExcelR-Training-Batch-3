import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required number machaa: ");
        int Complete_num = sc.nextInt();
   
        int last_digit = Complete_num % 10;
        while (Complete_num >= 10) {
            Complete_num = Complete_num / 10; 
        }
  
        int final_sum = Complete_num + last_digit;

        System.out.println("The final sum of the first and last digit is: " + final_sum);
    }
}