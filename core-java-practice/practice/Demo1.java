public class Demo1{
    static{
        System.out.println("Hii static block");

    }
    static {
        System.out.println("Hello static block");
    }

    public Demo1(){
        System.out.println("Hii i am constructor");
    }
    public static void main(String[] args) {
           Demo1 d=new Demo1();
          System.out.println("hii i am main method");
      
    }
}