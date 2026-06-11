import java.util.*;

public class UniqueCharacters {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static char[] uniqueCharacters(String str) {
        int len = findLength(str);

        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (ch == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[index++] = ch;
            }
        }

        char[] result = new char[index];

        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] unique = uniqueCharacters(text);

        System.out.println("Unique Characters:");

        for (char ch : unique) {
            System.out.print(ch + " ");
        }
    }
}