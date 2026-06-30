package MakerPlanQuestion.TransportCompany;

public class Bus extends Vehicle {
    public Bus(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double FuelCost(double Km) {
        return Km * 15;
    }
}