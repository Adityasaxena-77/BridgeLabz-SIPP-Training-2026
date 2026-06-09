
import java.util.Scanner;

public class Student {
    public Student() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int var2 = var1.nextInt();
        if (var2 >= 91) {
            System.out.println("O");
        } else if (var2 >= 81) {
            System.out.println("A+");
        } else if (var2 >= 71) {
            System.out.println("A");
        } else if (var2 >= 61) {
            System.out.println("B+");
        } else if (var2 >= 51) {
            System.out.println("B");
        } else if (var2 >= 41) {
            System.out.println("C");
        } else if (var2 == 40) {
            System.out.println("P");
        } else {
            System.out.println("F");
        }

    }
}
