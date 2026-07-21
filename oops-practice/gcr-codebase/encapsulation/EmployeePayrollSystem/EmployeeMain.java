package EmployeePayrollSystem;

public class EmployeeMain {

    public static void main(String[] args) {

        FullTimeEmployee fullTime = new FullTimeEmployee();
        fullTime.setEmployeeId(101);
        fullTime.setEmployeeName("Rahul");
        fullTime.setMonthlySalary(50000);

        System.out.println("----- Full-Time Employee -----");
        fullTime.displayEmployeeInfo();
        System.out.println("Salary : " + fullTime.calculateSalary());

        System.out.println();

        PartTimeEmployee partTime = new PartTimeEmployee();
        partTime.setEmployeeId(102);
        partTime.setEmployeeName("Priya");
        partTime.setHoursWorked(80);
        partTime.setHourlyRate(500);

        System.out.println("----- Part-Time Employee -----");
        partTime.displayEmployeeInfo();
        System.out.println("Salary : " + partTime.calculateSalary());
    }
}