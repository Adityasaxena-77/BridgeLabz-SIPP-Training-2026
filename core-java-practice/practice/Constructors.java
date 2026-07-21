public class Constructors {  
    //Constructor chaining:
    //Constructor overloading = passing different parameters.
    public Constructors(){  //Local Constructor chaining
        this(10,20);
        System.out.println("Hii 1");
    } 

    public Constructors(int a, int b){
        this(10.0);
        System.out.println("Hii 2");
    }

    public Constructors(double a){
        System.out.println("Hii 3");
    }
    public static void main(String[] args){
        Constructors c = new Constructors(); 
    }
}