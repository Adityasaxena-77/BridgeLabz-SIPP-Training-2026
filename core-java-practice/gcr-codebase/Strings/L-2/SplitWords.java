import java.util.Scanner;

public class SplitWords {

    public static String[] customSplit(String text) {

        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] arr = new String[words];
        String temp = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                arr[index++] = temp;
                temp = "";
            }
        }

        arr[index] = temp;
        return arr;
    }

    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] userSplit = customSplit(text);
        String[] builtSplit = text.split(" ");

        System.out.println("\nWords:");
        for (String word : userSplit) {
            System.out.println(word);
        }

        System.out.println("Arrays Equal: "
                + compareArrays(userSplit, builtSplit));
    }
}
