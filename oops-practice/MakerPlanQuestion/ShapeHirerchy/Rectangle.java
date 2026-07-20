package MakerPlanQuestion.ShapeHirerchy;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}