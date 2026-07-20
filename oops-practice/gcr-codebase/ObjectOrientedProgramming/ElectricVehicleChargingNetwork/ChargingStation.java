package gcr_codebase.OOPFundamentals.ElectricVehicleChargingNetwork;

public class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    int stationId;
    double unitsConsumed;

    public ChargingStation(int stationId, double unitsConsumed) {

        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;

        totalStations++;
    }
}