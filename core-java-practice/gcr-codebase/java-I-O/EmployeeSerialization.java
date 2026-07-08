import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {

    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }
}

public class EmployeeSerialization {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, department, salary);

        try {

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("employee.dat"));

            out.writeObject(emp);
            out.close();

            System.out.println("Employee Serialized Successfully.");

            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("employee.dat"));

            Employee e = (Employee) in.readObject();

            System.out.println("\nRecovered Employee Information");
            e.display();

            in.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}