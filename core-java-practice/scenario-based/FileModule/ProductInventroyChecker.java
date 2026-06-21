import java.io.*;

public class ProductInventroyChecker {
    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new FileReader("inventory.txt"));

        String line;

        System.out.println("Out of Stock Products:");

        while ((line = br.readLine()) != null) {

            String[] data = line.split("-");

            String product = data[0];
            int quantity = Integer.parseInt(data[1]);

            if (quantity == 0) {
                System.out.println(product);
            }
        }

        br.close();
    }
}