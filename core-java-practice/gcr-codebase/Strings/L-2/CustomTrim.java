import java.util.Scanner;

public class CustomTrim {

    public static String customTrim(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < str.length()
                && str.charAt(start) == ' ')
            start++;

        while (end >= 0
                && str.charAt(end) == ' ')
            end--;

        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String userTrim = customTrim(str);
        String builtTrim = str.trim();

        System.out.println("Custom Trim: " + userTrim);
        System.out.println("Built-in Trim: " + builtTrim);

        System.out.println(
                "Same Result: " +
                        userTrim.equals(builtTrim));
    }
}