public class PasswordStrengthChecker {

    public void checkpassword(String password) throws Invalid_PasswordException {
        try {
            if (password == null) {
                throw new NullPointerException();
            } else if (password.isEmpty()) {
                throw new Invalid_PasswordException("Password can not be empty");
            } else if (password.length() < 8) {
                throw new Invalid_PasswordException("Password should be atleast 8 characters");
            } else if (Character.isUpperCase(password.charAt(0))) {
                throw new Invalid_PasswordException("Password should start with a Lower case");
            } else if (!Character.isDigit(password.charAt(password.length() - 1))) {
                throw new Invalid_PasswordException("Password should end with a digit");
            }
        } catch (NullPointerException e) {
            System.out.println("Password cannot be null");
            // Aap chahein toh ise handle karein ya rethrow karein
        }
    }
}