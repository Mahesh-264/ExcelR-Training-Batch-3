import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        do {
            System.out.print("Enter username: ");
            username = scanner.nextLine().trim();
            System.out.print("Enter password: ");
            password = scanner.nextLine().trim();

            if (!(username.equals("Mahesh") && password.equals("Mahesh@123"))) {
                System.out.println("Welcome to Mallareddy University.\n");
            }else{
                System.out.println("Invalid creditentials.... Try Again!!");
            }
        } while (!(username.equals("Mahesh") && password.equals("Mahesh@123"))); // Loop if credentials are incorrect

        // Success message
        System.out.println(username + ", Welcome to MRU!");
        scanner.close();
    }
}
