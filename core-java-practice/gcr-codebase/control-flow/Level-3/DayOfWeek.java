import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Month: ");
        int m = sc.nextInt();

        System.out.print("Day: ");
        int d = sc.nextInt();

        System.out.print("Year: ");
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        int day = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day Number = " + day);
        System.out.println("0=Sunday, 1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday");
    }
}