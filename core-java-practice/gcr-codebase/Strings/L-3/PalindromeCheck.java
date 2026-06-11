import java.util.*;

public class PalindromeCheck {

    // Logic 1
    public static boolean palindromeLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    // Logic 2
    public static boolean palindromeRecursive(String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return palindromeRecursive(text, start + 1, end - 1);
    }

    // Reverse String
    public static char[] reverse(String text) {

        char[] rev = new char[text.length()];

        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            rev[index++] = text.charAt(i);
        }

        return rev;
    }

    // Logic 3
    public static boolean palindromeArray(String text) {

        char[] original = text.toCharArray();
        char[] reversed = reverse(text);

        for (int i = 0; i < original.length; i++) {

            if (original[i] != reversed[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Logic 1 : " + palindromeLoop(text));
        System.out.println("Logic 2 : " +
                palindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3 : " + palindromeArray(text));
    }
}