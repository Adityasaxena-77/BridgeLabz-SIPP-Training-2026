import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius cannot be negative.");
        }
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("\n--- Circle Properties ---");
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + String.format("%.4f", calculateArea()));
        System.out.println("Circumference : " + String.format("%.4f", calculateCircumference()));
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Circle Area & Circumference Calculator ===");
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        circle.displayDetails();

        scanner.close();
    }
}
