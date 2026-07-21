package ShapeHirerchy;

import java.util.Scanner;

public class ShapeMenu extends ShapeMenuAbs{
    Shape s;
    @Override
    public void choices(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Rectangle\n2.Circle\n3.Triangle\n4.Exit");
        int Choice = sc.nextInt();
        if(Choice == 4)
                break;
        switch (Choice) {
            case 1:
                System.out.print("Enter length: ");
                int length = sc.nextInt();
                System.out.print("Enter breadth: ");
                int breadth = sc.nextInt();
                Rectangle rect = new Rectangle();
                rect.setLength(length);
                rect.setBreath(breadth);
                s = rect;
                s.area();
                s.parameter();
                break;

            case 2:
                System.out.print("Enter radius: ");
                int radius = sc.nextInt();
                Circle circ = new Circle();
                circ.setRadius(radius);
                s = circ;
                s.area();
                s.parameter();
                break;

            case 3:
                System.out.print("Enter base: ");
                int base = sc.nextInt();
                System.out.print("Enter height: ");
                int height = sc.nextInt();
                System.out.print("Enter side 1: ");
                int side1 = sc.nextInt();
                System.out.print("Enter side 2: ");
                int side2 = sc.nextInt();
                System.out.print("Enter side 3: ");
                int side3 = sc.nextInt();
                Triangle tri = new Triangle();
                tri.setbase(base);
                tri.setheight(height);
                tri.setSides(side1, side2, side3);
                s = tri;
                s.area();
                s.parameter();
                break;

            default:
                System.out.println("Invalid Choice Try Again ! ");
                break;
            }
        }
    }
}
