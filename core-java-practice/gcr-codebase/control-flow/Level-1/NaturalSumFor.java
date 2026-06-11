import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int sumLoop = 0;

            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("For Loop Sum = " + sumLoop);
            System.out.println("Formula Sum = " + sumFormula);
            System.out.println("Both are equal? " + (sumLoop == sumFormula));
        } else {
            System.out.println("Not a natural number");
        }
    }
}