package gcr_codebase.Polymorphism.SmartNotificationSystem;

class PushNotification extends Notification {

    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}