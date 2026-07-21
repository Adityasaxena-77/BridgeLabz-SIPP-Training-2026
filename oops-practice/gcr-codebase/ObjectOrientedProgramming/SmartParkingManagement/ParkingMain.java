package gcr_codebase.OOPFundamentals.SmartParkingManagement;

public class ParkingMain {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = new Vehicle("UP85AB101", "Tarang", "Car");
        vehicles[1] = new Vehicle("UP85AB102", "Rahul", "Bike");
        vehicles[2] = new Vehicle("UP85AB103", "Priya", "Car");
        vehicles[3] = new Vehicle("UP85AB104", "Aman", "Bike");
        vehicles[4] = new Vehicle("UP85AB105", "Riya", "Car");
        vehicles[5] = new Vehicle("UP85AB106", "Kunal", "Bike");
        vehicles[6] = new Vehicle("UP85AB107", "Neha", "Car");
        vehicles[7] = new Vehicle("UP85AB108", "Vikas", "Bike");
        vehicles[8] = new Vehicle("UP85AB109", "Ankit", "Car");
        vehicles[9] = new Vehicle("UP85AB110", "Simran", "Bike");

        ParkingUtility utility = new ParkingUtility();
        utility.displayCars(vehicles);
        utility.displayBikes(vehicles);
    }
}