import java.util.Scanner;

public class Demo077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:  ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] copyArr = new int[n]; 
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            copyArr[i] = arr[i]; 
        }
        System.out.println("final array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(copyArr[i] + " ");
        }
        sc.close();
    }
}