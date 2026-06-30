package MakerPlanQuestion.TransportCompany;

public abstract class Vehicle {
    protected String VehicleNumber;

    public Vehicle(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public double FuelCost(double Km) {
        return Km;
    }
}