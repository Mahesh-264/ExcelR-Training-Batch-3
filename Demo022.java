import java.util.Scanner;

public class Demo022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();
        if(year % 4 == 0 && year%100 != 0 || year%400==0){
            System.out.println("It is a leap Year");
        }else{
            System.out.println("It is not a leap year");
        }
    }
}

