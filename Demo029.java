import java.util.Scanner;
import java.util.ArrayList;
public class Demo029{
public static void main(String[] args){
ArrayList<String> names = new ArrayList<String>();
Scanner sc = new Scanner(System.in);
    for(int i = 0; i < 10; i++){
        System.out.println("Enter name: ");
        names.add(sc.nextLine());
    }
    System.out.println("Names: ");
    for(String name : names){
        System.out.println(name);
    }
}

}