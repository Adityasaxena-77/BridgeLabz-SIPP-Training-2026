import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("bill.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
            count++;
        }

        br.close();

        System.out.println("Total Lines = " + count);
    }
}