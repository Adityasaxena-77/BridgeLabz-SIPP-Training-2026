import java.util.Scanner;

public class NumberCheckerUtility2 {
    public static int countDigits(int number) {
        int count = 0;
        int n = Math.abs(number);
        do {
            n /= 10;
            count++;
        } while (n != 0);
        return count;
    }

    public static int[] storeDigits(int number) {
        int n = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += digit;
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += (int) Math.pow(digit, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] frequencyOfDigits(int number) {
        int[] digits = storeDigits(number);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }
        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = storeDigits(number);
        System.out.println("Digit count: " + countDigits(number));
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Harshad number: " + isHarshadNumber(number));
        System.out.println("Digit frequencies:");
        int[][] freq = frequencyOfDigits(number);
        for (int[] entry : freq) {
            if (entry[1] > 0) {
                System.out.println("Digit " + entry[0] + " occurs " + entry[1] + " time(s)");
            }
        }
        scanner.close();
    }
}
