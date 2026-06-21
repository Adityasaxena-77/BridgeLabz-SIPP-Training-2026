
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
}

public class EmployeeSerialization {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, dept, salary);

        // Serialization
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("employee.dat"));
        oos.writeObject(emp);
        oos.close();

        // Deserialization
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("employee.dat"));

        Employee e = (Employee) ois.readObject();
        ois.close();

        System.out.println("\nRecovered Employee Data");
        System.out.println("ID: " + e.employeeId);
        System.out.println("Name: " + e.name);
        System.out.println("Department: " + e.department);
        System.out.println("Salary: " + e.salary);

        sc.close();
    }
}