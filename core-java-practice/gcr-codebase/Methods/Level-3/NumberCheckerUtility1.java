import java.util.Scanner;

public class NumberCheckerUtility1 {
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

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int number) {
        int[] digits = storeDigits(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == Math.abs(number);
    }

    public static int largestDigit(int[] digits) {
        int largest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) largest = digit;
        }
        return largest;
    }

    public static int secondLargestDigit(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return secondLargest;
    }

    public static int smallestDigit(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) smallest = digit;
        }
        return smallest;
    }

    public static int secondSmallestDigit(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = storeDigits(number);
        System.out.println("Digit count: " + countDigits(number));
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Duck number: " + isDuckNumber(number));
        System.out.println("Armstrong number: " + isArmstrong(number));
        System.out.println("Largest digit: " + largestDigit(digits));
        System.out.println("Second largest digit: " + secondLargestDigit(digits));
        System.out.println("Smallest digit: " + smallestDigit(digits));
        System.out.println("Second smallest digit: " + secondSmallestDigit(digits));
        scanner.close();
    }
}
