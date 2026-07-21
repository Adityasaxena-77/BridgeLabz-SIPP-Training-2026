package MakerPlanQuestion.ShapeHirerchy;

public class Triangle extends Shape {

    private double base;
    private double height;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

    @Override
    public void perimeter() {
        double side = Math.sqrt((base / 2) * (base / 2) + height * height);
        System.out.println("Perimeter of Triangle: " + (base + 2 * side));
    }
}