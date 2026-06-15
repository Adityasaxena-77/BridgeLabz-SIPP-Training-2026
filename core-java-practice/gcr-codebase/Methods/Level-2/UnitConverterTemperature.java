public class UnitConverterTemperature {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9.0;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5.0) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("32°F = " + convertFahrenheitToCelsius(32) + "°C");
        System.out.println("0°C = " + convertCelsiusToFahrenheit(0) + "°F");
        System.out.println("1 pound = " + convertPoundsToKilograms(1) + " kg");
        System.out.println("1 kilogram = " + convertKilogramsToPounds(1) + " pounds");
        System.out.println("1 gallon = " + convertGallonsToLiters(1) + " liters");
        System.out.println("1 liter = " + convertLitersToGallons(1) + " gallons");
    }
}
