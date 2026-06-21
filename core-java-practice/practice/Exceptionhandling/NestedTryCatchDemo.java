public class NestedTryCatchDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int index = 2;
        int divisor = 0;

        try {
            int value = numbers[index];
            try {
                int result = value / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
