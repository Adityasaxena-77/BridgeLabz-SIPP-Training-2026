import java.util.Scanner;

public class VowelConsonantCount {

    public static String check(char ch) {

        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                return "Vowel";

            return "Consonant";
        }

        return "Not a Letter";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {

            String result = check(str.charAt(i));

            if (result.equals("Vowel"))
                vowels++;

            else if (result.equals("Consonant"))
                consonants++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
