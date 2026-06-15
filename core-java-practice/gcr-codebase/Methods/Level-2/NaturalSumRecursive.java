import java.util.Scanner;

public class NaturalSumRecursive {
    public static int sumRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a natural number (non-negative). ");
        } else {
            int recursiveSum = sumRecursive(n);
            int formulaSum = sumFormula(n);
            System.out.println("Recursive sum: " + recursiveSum);
            System.out.println("Formula sum: " + formulaSum);
            System.out.println("Both results are equal: " + (recursiveSum == formulaSum));
        }

        scanner.close();
    }
}
