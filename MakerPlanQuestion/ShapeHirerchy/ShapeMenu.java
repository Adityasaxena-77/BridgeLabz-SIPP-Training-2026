package MakerPlanQuestion.ShapeHirerchy;

import java.util.Scanner;

public class ShapeMenu extends ShapeMenuAbs {

    @Override
    public void Choices() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Rectangle");
            System.out.println("2.Triangle");
            System.out.println("3.Circle");
            System.out.println("4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Rectangle r = new Rectangle();
                    System.out.print("Enter Length: ");
                    r.setLength(sc.nextInt());
                    System.out.print("Enter Width: ");
                    r.setWidth(sc.nextInt());
                    r.area();
                    r.perimeter();
                    break;

                case 2:
                    Triangle t = new Triangle();
                    System.out.print("Enter Base: ");
                    t.setBase(sc.nextDouble());
                    System.out.print("Enter Height: ");
                    t.setHeight(sc.nextDouble());
                    t.area();
                    t.perimeter();
                    break;

                case 3:
                    Circle c = new Circle();
                    System.out.print("Enter Radius: ");
                    c.setRadius(sc.nextDouble());
                    c.area();
                    c.perimeter();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}