import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        // Use a do-while loop to validate credentials
        do {
            System.out.print("Enter username: ");
            username = scanner.nextLine().trim(); // Trim to remove extra spaces
            System.out.print("Enter password: ");
            password = scanner.nextLine().trim(); // Trim to remove extra spaces

            if (!(username.equals("Mahesh") && password.equals("Mahesh@123"))) {
                System.out.println(+username"Welcome to Mallareddy University.\n");
            }
        } while (!(username.equals("Mahesh") && password.equals("Mahesh@123"))); // Loop if credentials are incorrect

        // Success message
        System.out.println(username + ", Welcome to MRU!");
        scanner.close();
    }
}
