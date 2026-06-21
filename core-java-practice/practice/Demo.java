import java.util.Scanner;

public class Demo {

    public static int product(int n) {
        if (n == 1) {
            return 1;
        }

        return n * product(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        System.out.println("The product of " + n + " is: " + product(n));

        sc.close();
    }
}