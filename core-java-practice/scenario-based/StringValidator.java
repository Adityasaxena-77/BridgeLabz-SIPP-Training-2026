public class StringValidator {

    public static boolean isValid(String username, int index) {
        if (index == username.length()) {
            return true;
        }

        char ch = username.charAt(index);

        // char[] ch = username.toCharArray();

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValid(username, index + 1);
    }

    public static void main(String[] args) {
        StringValidator stringValidator = new StringValidator();
        boolean rs =  stringValidator.isValid("Sahil123", 0);
        System.out.println(isValid("sahil", 0));
    }
}