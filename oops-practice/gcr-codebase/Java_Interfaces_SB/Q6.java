interface HeartRateMonitor {

    void displayHeartRate(int rate);

    default void displayHealthTips() {
        System.out.println("Exercise regularly.");
    }

    static boolean isPatientIdValid(String patientId) {
        return patientId.length() == 5;
    }
}

interface TemperatureMonitor {

    void displayTemperature(double temp);

    default void displayHealthTips() {
        System.out.println("Drink plenty of water.");
    }
}

class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {

    @Override
    public void displayHeartRate(int rate) {
        System.out.println("Heart Rate: " + rate + " bpm");
    }

    @Override
    public void displayTemperature(double temp) {
        System.out.println("Temperature: " + temp + " °C");
    }

    @Override
    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    public static void main(String[] args) {

        String[] names = {
                "Aditya",
                "Rahul",
                "Priya"
        };

        String[] ids = {
                "P1001",
                "P10",
                "P2002"
        };

        int[] heartRates = {
                75,
                88,
                70
        };

        double[] temperatures = {
                36.7,
                38.5,
                37.0
        };

        HealthMonitoringSystem system = new HealthMonitoringSystem();

        system.displayHealthTips();
        System.out.println();

        for (int i = 0; i < names.length; i++) {

            System.out.println("Patient: " + names[i]);

            if (HeartRateMonitor.isPatientIdValid(ids[i])) {

                System.out.println("Patient ID Valid");
                system.displayHeartRate(heartRates[i]);
                system.displayTemperature(temperatures[i]);

                if (heartRates[i] <= 100 && temperatures[i] <= 37.5)
                    System.out.println("Health Status: Normal");
                else
                    System.out.println("Health Status: Needs Attention");

            } else {
                System.out.println("Invalid Patient ID");
            }

            System.out.println();
        }
    }
}