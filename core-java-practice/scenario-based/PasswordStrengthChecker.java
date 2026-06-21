public class PasswordStrengthChecker {
     public void checkpassword(String password){
        throw InvalidPasswordException{
            try{
                if(password==null){
                    throw new NullPointerException();
                }else if(password.isEmpty()){
                    throw new  InvalidPasswordException("Password can not be empty");
                }else if(password.length()<8){
                    throw new InvalidPasswordException("Password should be atleast 8 characters long");
                }else if(Character.isUpperCase(password.charAt(0))){
                    throw new InvalidPasswordException("Password should start with a Lower case letter");
                }else if(!Character.isDigit(password.charAt(password.length()-1))){
                    throw new InvalidPasswordException("Password should end with a digit");
                }
            }
        }
     }
}
