package VehicleRentalSystem;

public class RentalMain {

    public static void main(String[] args) {

        Car car = new Car();
        car.setVehicleNumber("DL01AB1234");
        car.setVehicleType("Car");
        car.setDailyRate(1500);

        System.out.println("----- Car Details -----");
        car.displayVehicleInfo();
        System.out.println("Rental Cost (5 Days) : " + car.calculateRentalCost(5));

        System.out.println();

        Bike bike = new Bike();
        bike.setVehicleNumber("DL02XY5678");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);

        System.out.println("----- Bike Details -----");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost (5 Days) : " + bike.calculateRentalCost(5));

        System.out.println();

        Truck truck = new Truck();
        truck.setVehicleNumber("DL03TR9999");
        truck.setVehicleType("Truck");
        truck.setDailyRate(3000);
        truck.setLoadingCharge(2000);

        System.out.println("----- Truck Details -----");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost (5 Days) : " + truck.calculateRentalCost(5));
    }
}