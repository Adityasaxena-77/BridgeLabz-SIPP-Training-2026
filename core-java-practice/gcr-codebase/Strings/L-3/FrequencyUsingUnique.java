import java.util.*;

public class FrequencyUsingUnique {

    public static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[index++] = text.charAt(i);
            }
        }

        char[] result = new char[index];

        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);

        System.out.println("Character\tFrequency");

        for (char ch : unique) {
            System.out.println(ch + "\t\t" + freq[ch]);
        }
    }
}