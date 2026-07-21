package level_2;

class Student {
    private String name;
    private int rollNumber;
    private double marks;


    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }


    public String calculateGrade() {
        if (marks >= 90.0) {
            return "A+";
        } else if (marks >= 80.0) {
            return "A";
        } else if (marks >= 70.0) {
            return "B";
        } else if (marks >= 60.0) {
            return "C";
        } else if (marks >= 50.0) {
            return "D";
        } else if (marks >= 40.0) {
            return "E";
        } else {
            return "F (Fail)";
        }
    }


    public void displayDetails() {
        System.out.println("+----------------------------------------+");
        System.out.println("|          STUDENT REPORT CARD           |");
        System.out.println("+----------------------------------------+");
        System.out.printf("| Name        : %-24s |\n", name);
        System.out.printf("| Roll Number : %-24d |\n", rollNumber);
        System.out.printf("| Marks       : %-24.2f |\n", marks);
        System.out.printf("| Grade       : %-24s |\n", calculateGrade());
        System.out.println("+----------------------------------------+");
        System.out.println();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class StudentReport {
    public static void main(String[] args) {
        System.out.println("=== Running Student Report Simulation ===\n");


        Student student1 = new Student("Alice Smith", 101, 92.5);
        Student student2 = new Student("Bob Johnson", 102, 78.0);
        Student student3 = new Student("Charlie Brown", 103, 55.4);
        Student student4 = new Student("Diana Prince", 104, 38.0);


        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
    }
}
