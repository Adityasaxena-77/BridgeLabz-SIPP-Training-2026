import java.util.*;

public class ShapeMenu extends ShapeMenuabs{
    Shape s;
    @Override
    public void choices(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n1.Rectangle\n2.Circle\n3.Triangle\n4.Exit\n");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            if(choice==4){
                System.out.println("Exiting...");
                return;
            }
            switch(choice){
                case 1: s=new Rectangle();
                ((Rectangle)s).setLength(10);
                ((Rectangle)s).setBreadth(5);
                s.area();
                s.perimeter();
                break;

                case 2: s=new Triangle();
                ((Triangle)s).setLength(10);
                ((Triangle)s).setbreadth(5);
                ((Triangle)s).setC(8);
                s.area();
                s.perimeter();
                break;

                case 3: s=new Circle();
                ((Circle)s).setr(5);
                s.area();
                s.perimeter();
                break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

}