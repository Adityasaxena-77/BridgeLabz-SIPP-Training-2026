package ShapeHirerchy;

public class Circle extends Shape{
    private int radius;

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setheight(int radius){
        this.radius = radius;
    }
    
    @Override
    public void area(){
        System.out.println("Area of circle : " + (Math.PI * radius * radius));
    }

    @Override
    public void parameter(){
        System.out.println("Perimeter of circle : " + (2 * Math.PI * radius));
    }
}
