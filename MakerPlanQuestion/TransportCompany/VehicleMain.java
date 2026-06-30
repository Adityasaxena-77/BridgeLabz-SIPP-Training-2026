package MakerPlanQuestion.TransportCompany;

public class VehicleMain {
    public static void main(String[] args) {
        double distance = 100;

        Vehicle[] fleet = {
                new Bike("BIKE101"),
                new Car("CAR304"),
                new Bus("BUS201")
        };

        for (Vehicle v : fleet) {
            System.out.println("The Vehicle Number is:- " + v.VehicleNumber);
            System.out.println("Cost Per " + distance + "Km is " + v.FuelCost(distance));

            if(v instanceof Car){
                System.out.println("The Vehicle Type is:- Car");
            } else if(v instanceof Bike){
                System.out.println("The Vehicle Type is:- Bike");
            } else if(v instanceof Bus){
                System.out.println("The Vehicle Type is:- Bus");
            } else {
                System.out.println("The Vehicle Type is:- Unknown");
            }
            System.out.println("----------------------------------------------------------------");
        }
        }
}