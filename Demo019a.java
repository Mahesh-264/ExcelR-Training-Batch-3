import java.util.Scanner;
class Demo019a{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the number: "+a);
        int rounded = (((a+2/5)/5)*5);
        System.out.println("Rounded multiple of 5 is"+ rounded);
    }
}