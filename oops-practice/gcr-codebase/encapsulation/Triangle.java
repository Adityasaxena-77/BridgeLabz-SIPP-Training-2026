public class Triangle extends Shape{
    private int length;
    private int breadth;
    private int height;
    Triangle t;
    public void setLength(int length){
        this.length=length;

    }public void setbreadth(int breadth){
        this.breadth=breadth;
    }

    public void setC(int height){
        this.height=height;
    }

    @Override
    public void area(){
        System.out.println("Area of the triangle: " + (length*breadth/2));
    }
    @Override
    public void perimeter(){
        System.out.println("Perimeter of the triangle: " + (length+breadth+height));
    }
}