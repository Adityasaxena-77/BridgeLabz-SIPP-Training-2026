package gcr_codebase.Inheritance.VehicleManagementSystemwithHybridInheritance;

public class Main {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(180, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(220, "Honda City");

        System.out.println("----- Electric Vehicle -----");
        ev.displayDetails();
        ev.charge();

        System.out.println();

        System.out.println("----- Petrol Vehicle -----");
        pv.displayDetails();
        pv.refuel();
    }
}