import java.util.Scanner;

public class Login {
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
                System.out.println(+username"Welcome to Mallareddy University.\n");
            }
        } while (!(username.equals("Mahesh") && password.equals("Mahesh@123")));
        System.out.println(username + ", Welcome to MRU!");
    }
}
