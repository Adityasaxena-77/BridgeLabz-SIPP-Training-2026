package gcr_codebase.OOPFundamentals.ElectricVehicleChargingNetwork;

public class EVChargingMain {

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation(101, 120);
        ChargingStation s2 = new ChargingStation(102, 150);
        ChargingStation s3 = new ChargingStation(103, 200);
        ChargingStation s4 = new ChargingStation(104, 175);
        ChargingStation s5 = new ChargingStation(105, 250);

        ChargingStationService service = new ChargingStationService();

        service.displayStationDetails(s1);
        service.displayStationDetails(s2);
        service.displayStationDetails(s3);
        service.displayStationDetails(s4);
        service.displayStationDetails(s5);

        System.out.println("\nTotal Stations : " + ChargingStation.totalStations);
        System.out.println("\nUpdating Electricity Rate...\n"        );

        ChargingStation.electricityRate = 10.0;

        service.displayStationDetails(s1);
        service.displayStationDetails(s2);
        service.displayStationDetails(s3);
        service.displayStationDetails(s4);
        service.displayStationDetails(s5);
    }
}