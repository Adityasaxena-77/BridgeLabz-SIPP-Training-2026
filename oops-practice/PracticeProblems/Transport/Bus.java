package Transport;

public class Bus extends Vehicle{

    public Bus(String vehicleNumber) {
        super(vehicleNumber);
    }
    
    @Override
    public double FuelCost(double km){
        return km*15;
    }
}
