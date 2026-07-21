package Calculator;

class calculation {

    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    public void divide(int a, int b) {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }
}

