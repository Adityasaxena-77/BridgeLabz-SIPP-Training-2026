package Transport;

public class Car extends Vehicle{

    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double FuelCost(double km){
        return km*25;
    }

    
}
