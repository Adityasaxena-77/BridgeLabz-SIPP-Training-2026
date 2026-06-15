import java.util.Scanner;

public class NumberCheckerUtility5 {
    public static int sumOfProperDivisors(int number) {
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfectNumber(int number) {
        return number > 1 && sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        return sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        return sumOfProperDivisors(number) < number;
    }

    public static boolean isStrongNumber(int number) {
        int n = number;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            int fact = 1;
            for (int i = 2; i <= digit; i++) fact *= i;
            sum += fact;
            n /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Perfect: " + isPerfectNumber(number));
        System.out.println("Abundant: " + isAbundantNumber(number));
        System.out.println("Deficient: " + isDeficientNumber(number));
        System.out.println("Strong: " + isStrongNumber(number));
        scanner.close();
    }
}
