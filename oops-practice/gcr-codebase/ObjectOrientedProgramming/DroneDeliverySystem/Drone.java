package gcr_codebase.OOPFundamentals.DroneDeliverySystem;

public class Drone {
    int droneId;
    int batteryPercentage;
    static String companyName = "SkyDeliver Logistics";

    public Drone(int droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage >= 20) {
            System.out.println("Drone " + droneId + " started delivery.");
            batteryPercentage -= 20;
        }
        else {
            System.out.println("Drone " + droneId + " has insufficient battery.");
        }
    }

    public void displayStatus() {

        System.out.println("\nDrone ID : " + droneId);
        System.out.println("Battery  : " + batteryPercentage + "%");
        System.out.println("Company  : " + companyName);
    }
}