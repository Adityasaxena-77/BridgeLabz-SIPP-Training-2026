import java.util.*;

public class UpperCaseDemo {

    static String convertUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        return result;
    }

    static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String userUpper = convertUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("User: " + userUpper);
        System.out.println("Built-in: " + builtInUpper);
        System.out.println("Same: " + compare(userUpper, builtInUpper));
    }
}