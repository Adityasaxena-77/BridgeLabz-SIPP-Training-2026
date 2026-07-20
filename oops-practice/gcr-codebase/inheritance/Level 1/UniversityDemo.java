class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    protected final int studentId;
    protected double gpa;

    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId +
                ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int age, int studentId,
                       double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Thesis: " + thesis;
    }
}

public class UniversityDemo {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Aditya", 21, 101, 8.9,
                "Artificial Intelligence");

        System.out.println(gs);

        System.out.println("\nIS-A Relationship:");

        Person p = gs;
        Student s = gs;

        System.out.println("GradStudent IS-A Person : " + (p instanceof Person));
        System.out.println("GradStudent IS-A Student : " + (s instanceof Student));
        System.out.println("GradStudent IS-A GradStudent : " + (gs instanceof GradStudent));
    }
}