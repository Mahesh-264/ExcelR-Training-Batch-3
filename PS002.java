import java.util.Scanner;

class Employee {
    int id;
    String firstName;
    String lastName;
    String address;

    Employee() {
        this(0, null, null, null);
    }

    Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    String getFullName() {
        return firstName + " " + lastName;
    }
}

class PartTimeEmployee extends Employee {
    private double amountPerHour;
    private int hoursWorked;

    PartTimeEmployee(int id, String firstName, String lastName, String address, double amountPerHour, int hoursWorked) {
        super(id, firstName, lastName, address);
        this.amountPerHour = amountPerHour;
        this.hoursWorked = hoursWorked;
    }

    double computeSal() {
        return amountPerHour * hoursWorked;
    }

    void showDetails() {
        System.out.println("Part Time Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + getFullName());
        System.out.println("Address: " + address);
        System.out.println("Total Salary: " + computeSal());
    }
}

class FullTimeEmployee extends Employee {
    double basic;
    double bonus;

    FullTimeEmployee(int id, String firstName, String lastName, String address, double basic, double bonus) {
        super(id, firstName, lastName, address);
        this.basic = basic;
        this.bonus = bonus;
    }

    double computeSal() {
        return basic + bonus;
    }

    void showDetails() {
        System.out.println("Full Time Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + getFullName());
        System.out.println("Address: " + address);
        System.out.println("Gross Salary: " + computeSal());
    }
}

public class PS002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part Time Employee
        PartTimeEmployee partTimeEmp = new PartTimeEmployee(101, "Mahesh", "Bob", "Hyderabad", 99, 8);
        partTimeEmp.showDetails();

        System.out.println();

        // Full Time Employee
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(102, "Mahesh", "Bob", "Hyderabad", 199, 15);
        fullTimeEmp.showDetails();

        sc.close();
    }
}
