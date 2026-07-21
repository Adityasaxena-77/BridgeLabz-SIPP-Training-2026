class Vehicle {

    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    double calculateToll() {
        return 0;
    }
}

class Car extends Vehicle {

    Car(String number, String owner) {
        super(number, owner);
    }

    @Override
    double calculateToll() {
        return 100;
    }
}

class Bus extends Vehicle {

    Bus(String number, String owner) {
        super(number, owner);
    }

    @Override
    double calculateToll() {
        return 250;
    }
}

class Truck extends Vehicle {

    Truck(String number, String owner) {
        super(number, owner);
    }

    @Override
    double calculateToll() {
        return 400;
    }
}

public class TollManagement {

    static double calculateTotalRevenue(Vehicle[] vehicles) {

        double total = 0;

        for (Vehicle v : vehicles)
            total += v.calculateToll();

        return total;
    }

    static void searchVehicle(Vehicle[] vehicles, String number) {

        for (Vehicle v : vehicles) {

            if (v.vehicleNumber.equals(number)) {
                System.out.println("Vehicle Found");
                System.out.println(v.vehicleNumber + "  " + v.ownerName);
                return;
            }
        }

        System.out.println("Vehicle Not Found");
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {

                new Car("UP93A101", "Aditya"),
                new Truck("UP32T202", "Rahul"),
                new Bus("MP12B303", "Priya"),
                new Truck("DL05T404", "Rohit")
        };

        double max = 0;
        Vehicle highest = null;

        int cars = 0, buses = 0, trucks = 0;

        for (Vehicle v : vehicles) {

            double toll = v.calculateToll();

            if (toll > max) {
                max = toll;
                highest = v;
            }

            if (v instanceof Car)
                cars++;
            else if (v instanceof Bus)
                buses++;
            else if (v instanceof Truck)
                trucks++;
        }

        System.out.println("Total Revenue = ₹" +
                calculateTotalRevenue(vehicles));

        searchVehicle(vehicles, "UP32T202");

        System.out.println("\nHighest Toll Vehicle");

        System.out.println(highest.vehicleNumber +
                " ₹" + highest.calculateToll());

        System.out.println("\nCars = " + cars);
        System.out.println("Buses = " + buses);
        System.out.println("Trucks = " + trucks);
    }
}