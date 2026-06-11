import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int sumLoop = 0;
            int i = 1;

            while (i <= n) {
                sumLoop += i;
                i++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("While Loop Sum = " + sumLoop);
            System.out.println("Formula Sum = " + sumFormula);
            System.out.println("Both are equal? " + (sumLoop == sumFormula));
        } else {
            System.out.println("Not a natural number");
        }
    }
}