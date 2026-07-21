package gcr_codebase.Polymorphism.SmartNotificationSystem;

class EmailNotification extends Notification {

    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}