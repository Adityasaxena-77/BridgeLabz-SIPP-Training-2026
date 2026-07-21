package gcr_codebase.OOPFundamentals.SmartParkingManagement;

public class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleNumber='" + vehicleNumber + '\'' + ", ownerName='" + ownerName + '\'' + ", vehicleType='" + vehicleType + '\'' + '}';
    }
}