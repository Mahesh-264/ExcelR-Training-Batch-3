import java.util.Scanner;

class CircleAreaDemo1 {
    private double radius;

    public CircleAreaDemo1(double radius) {
        this.radius = radius;
    }

    void Area() {
        double ca = Math.PI * Math.pow(radius, 2);
        System.out.println("The circle area is: " + ca);
    }
}

public class Demo012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        sc.close();

        CircleAreaDemo1 obj = new CircleAreaDemo1(r);
        obj.Area();
    }
}
