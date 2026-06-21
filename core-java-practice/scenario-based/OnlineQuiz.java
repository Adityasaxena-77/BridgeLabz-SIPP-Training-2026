public class OnlineQuiz {
    
    String answers[] = {"A", "B", null, "D"};

    public void checkAnswer(int index) throws InvalidAnswerException {

        try {

            if (answers[index].equals("A")) {
                System.out.println("Question " + (index + 1) + " : Correct");
            } else {
                System.out.println("Question " + (index + 1) + " : Wrong");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidAnswerException(index);

        } catch (NullPointerException e) {
            System.out.println("Answer at index " + index + " is null");
        }
    }

    public static void main(String[] args) {

        OnlineQuiz quiz = new OnlineQuiz();

        for (int i = 0; i < quiz.answers.length; i++) {

            try {
                quiz.checkAnswer(i);

            } catch (InvalidAnswerException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}