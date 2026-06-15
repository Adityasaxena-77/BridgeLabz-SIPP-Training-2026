import java.util.Scanner;

public class CalendarProgram {
    public static String[] months = {"", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

    public static int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return daysInMonth[month];
    }

    public static int getFirstDay(int month, int year) {
        int y = year - (month < 3 ? 1 : 0);
        int days = y + y / 4 - y / 100 + y / 400 + (13 * (month + 12 * ((14 - month) / 12)) - 2) / 5 + 1;
        return days % 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);

        System.out.println("\n" + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
