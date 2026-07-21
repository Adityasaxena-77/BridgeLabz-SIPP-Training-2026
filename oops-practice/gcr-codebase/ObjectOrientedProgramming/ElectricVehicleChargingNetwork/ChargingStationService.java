package gcr_codebase.OOPFundamentals.ElectricVehicleChargingNetwork;

public class ChargingStationService {
    public double calculateBill(ChargingStation station) {
        return station.unitsConsumed * ChargingStation.electricityRate;
    }

    public void displayStationDetails(ChargingStation station) {
        System.out.println("\nStation ID    : " + station.stationId);
        System.out.println("Units Consumed  : " + station.unitsConsumed);
        System.out.println("Electricity Rate: ₹" + ChargingStation.electricityRate);
        System.out.println("Bill Amount     : ₹" + calculateBill(station));
    }
}