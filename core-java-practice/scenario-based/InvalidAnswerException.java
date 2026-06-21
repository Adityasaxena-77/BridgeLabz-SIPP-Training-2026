public class InvalidAnswerException extends Exception {
    
    public InvalidAnswerException(int index) {
        super("Invalid answer at index: " + index);
    }
}
