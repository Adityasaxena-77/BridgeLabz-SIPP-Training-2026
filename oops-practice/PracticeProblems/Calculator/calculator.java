package Calculator;

class AdvancedCalculator extends calculation {

    @Override
    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    @Override
    public void divide(int a, int b) {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }
}