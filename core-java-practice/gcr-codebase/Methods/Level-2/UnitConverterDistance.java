import java.util.Scanner;

public class UnitConverterDistance {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        double km = scanner.nextDouble();

        System.out.println("Kilometers to Miles: " + convertKmToMiles(km));
        System.out.println("Miles to Kilometers: " + convertMilesToKm(1.0));
        System.out.println("Meters to Feet: " + convertMetersToFeet(10.0));
        System.out.println("Feet to Meters: " + convertFeetToMeters(10.0));

        scanner.close();
    }
}
