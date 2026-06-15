import java.util.Scanner;

public class NumberCheckerUtility3 {
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

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = storeDigits(number);
        System.out.println("Digit count: " + countDigits(number));
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Reversed digits: " + java.util.Arrays.toString(reverseDigits(digits)));
        System.out.println("Palindrome: " + isPalindrome(number));
        System.out.println("Duck number: " + isDuckNumber(number));
        scanner.close();
    }
}
