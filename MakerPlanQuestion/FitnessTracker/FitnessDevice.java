package MakerPlanQuestion.FitnessTracker;

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity logged successfully.");
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness report generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Health alert sent.");
    }
}