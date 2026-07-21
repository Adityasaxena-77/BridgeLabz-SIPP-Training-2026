public class Rectangle extends Shape{

    private int length;
    private int breadth;
    Rectangle g;
    public void setLength(int length){
        this.length=length;
        
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }
    @Override
    public  void area(){
    System.out.println("Area of the rectangle: " + (length*breadth));
    }
    @Override
    public void perimeter(){
        System.out.println("Perimeter of the rectangle: "+2*(length+breadth));
    }
    

}