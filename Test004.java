import java.util.Scanner;
public class Test004{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String username;
        int password;
        username = sc.next();
        password = sc.nextInt();
        if(username.equals("Mahesh") && password == 000){
            System.out.println("Welcome user");
    }else{
        System.out.println("Invalid username or password");
    }
}
}