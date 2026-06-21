import java.io.*;

public class FeedbackAnalyzer {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new FileReader("feedback.txt"));

        String line;
        int count = 0;
        int total = 0;

        while ((line = br.readLine()) != null && total < 5) {

            if (line.toLowerCase().contains("good")) {
                count++;
            }

            total++;
        }

        br.close();

        System.out.println("Messages containing 'good' = " + count);
    }
}