package Transport;

public abstract class Vehicle {
    protected String VehicleNumber;

    public Vehicle(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public abstract double FuelCost(double km);

    
}
