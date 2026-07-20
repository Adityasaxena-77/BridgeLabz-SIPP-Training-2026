package Transport;

import java.nio.channels.Pipe.SourceChannel;

public class Main {
    public static void main(String[] args) {
        double distance = 100;
        Vehicle[] fleet = {
            new Bike("Bike101"), 
            new Car("Car201"),
            new Bus("Bus301")
        };
        for(Vehicle v : fleet){
            System.out.println("The Vehicle number is : "+v.VehicleNumber);
            System.out.println("Cost per "+distance+"Km is "+v.FuelCost(distance));

            if(v instanceof Car){
                System.out.println("This is a Car !!");
            }else if(v instanceof Bike){
                System.out.println("This is a Bike !!");
            }else if(v instanceof Bus){
                System.out.println("This is a Bus !!");
            }else{
                System.out.println("Invalid Vehicle Type :( ");
            }
            System.out.println("-------------------------");
        }
    }

}
