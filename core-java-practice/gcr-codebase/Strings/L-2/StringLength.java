import java.util.Scanner;

public class StringLength {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();

        int userLength = findLength(str);
        int builtInLength = str.length();

        System.out.println("Length using charAt(): " + userLength);
        System.out.println("Length using length(): " + builtInLength);
    }
}