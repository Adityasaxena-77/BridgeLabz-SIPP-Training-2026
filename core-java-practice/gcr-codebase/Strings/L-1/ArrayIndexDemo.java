import java.util.*;

public class ArrayIndexDemo {

    static void handleException(String arr[]) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        handleException(arr);
    }
}