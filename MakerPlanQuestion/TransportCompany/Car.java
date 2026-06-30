package MakerPlanQuestion.TransportCompany;




public class Car extends Vehicle {
    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double FuelCost(double Km) {
        return Km * 10;
    }
}