package gcr_codebase.OOPFundamentals.SmartParkingManagement;

public class ParkingUtility {

    public void displayCars(Vehicle[] vehicles) {
        System.out.println("\n----- Cars -----");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.vehicleType.equalsIgnoreCase("Car")) {
                System.out.println(vehicle);
            }
        }
    }

    public void displayBikes(Vehicle[] vehicles) {
        System.out.println("\n----- Bikes -----");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.vehicleType.equalsIgnoreCase("Bike")) {
                System.out.println(vehicle);
            }
        }
    }
}