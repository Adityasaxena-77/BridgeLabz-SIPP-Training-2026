import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int a = scanner.nextInt();

            System.out.print("Enter second integer: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
            scanner.close();
        }
    }
}
