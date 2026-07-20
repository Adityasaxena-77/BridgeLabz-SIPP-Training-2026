package ShapeHirerchy;

public class Triangle extends Shape{
    private int base;
    private int height;
    private int side1;
    private int side2;
    private int side3;

    public void setbase(int base){
        this.base = base;
    }

    public void setheight(int height){
        this.height = height;
    }

    public void setSides(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public void area(){
        double areaVal = 0.5 * base * height;
        System.out.println("Area of triangle : " + areaVal);
    }

    @Override
    public void parameter(){
        int perimeterVal = side1 + side2 + side3;
        System.out.println("Perimeter of triangle : " + perimeterVal);
    }
}
