package level_2;

class PalindromeChecker {
    private String text;


    public PalindromeChecker(String text) {
        this.text = text;
    }


    public boolean isPalindrome() {
        if (text == null) {
            return false;
        }


        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        String cleanedStr = cleaned.toString();
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public void displayResult() {
        System.out.println("+----------------------------------------+");
        System.out.println("|           PALINDROME CHECK             |");
        System.out.println("+----------------------------------------+");
        System.out.printf("| Original Text: %-23s |\n", truncateText(text, 22));
        System.out.printf("| Is Palindrome: %-23s |\n", isPalindrome() ? "Yes (True)" : "No (False)");
        System.out.println("+----------------------------------------+");
        System.out.println();
    }


    private String truncateText(String input, int maxLength) {
        if (input == null) return "";
        if (input.length() <= maxLength) return input;
        return input.substring(0, maxLength - 3) + "...";
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("=== Running Palindrome Checker Simulation ===\n");


        String[] testCases = {
            "radar",
            "hello",
            "A man, a plan, a canal: Panama!",
            "Step on no pets",
            "Java OOPs",
            "Racecar"
        };

        for (String testCase : testCases) {
            PalindromeChecker checker = new PalindromeChecker(testCase);
            checker.displayResult();
        }
    }
}
