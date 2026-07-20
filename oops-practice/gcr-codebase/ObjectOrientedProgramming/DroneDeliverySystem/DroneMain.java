package gcr_codebase.OOPFundamentals.DroneDeliverySystem;

public class DroneMain {

    public static void main(String[] args) {

        Drone d1 = new Drone(101, 90);
        Drone d2 = new Drone(102, 75);
        Drone d3 = new Drone(103, 15);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        System.out.println("\nChanging Company Name...\n");

        Drone.companyName = "Express Drone Services";

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}