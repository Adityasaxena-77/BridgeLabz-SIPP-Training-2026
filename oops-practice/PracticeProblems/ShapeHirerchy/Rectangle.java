package ShapeHirerchy;

public class Rectangle extends Shape{
    private int length;
    private int breath;

    public void setBreath(int breath){
        this.breath = breath;
    }

    public void setLength(int length){
        this.length = length;
    }

    @Override
    public void area(){
        System.out.println("Area of rectangle is : " + (length * breath));
    }
    @Override
    public void parameter(){
        System.out.println("Parameter of rectangle is : " + (2 * (length + breath)));
    }
}
