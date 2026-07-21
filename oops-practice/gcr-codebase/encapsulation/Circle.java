public class Circle extends Shape{
    private double radius;
    private final double pi=3.14;

    Circle c;
    public void setr(double radius){
        this.radius=radius;
    }
    @Override
    public void area(){
        System.out.println("Area of the Circle: " +(pi*radius*radius));
    }
    @Override
    public void perimeter(){
        System.out.println("Circumference of the Circle: " + (2*pi*radius));
    }
}