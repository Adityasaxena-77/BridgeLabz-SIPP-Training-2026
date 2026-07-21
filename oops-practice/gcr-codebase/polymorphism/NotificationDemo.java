class Notification {

    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Sending Notification...");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Email sent to " + recipientName +
                " : " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("SMS sent to " + recipientName +
                " : " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName +
                " : " + message);
    }
}

public class NotificationDemo {

    public static void main(String[] args) {

        Notification[] notifications = {

                new EmailNotification("Aditya", "Interview Scheduled"),
                new SMSNotification("Rahul", "OTP: 458721"),
                new PushNotification("Priya", "Your order has been shipped")
        };

        System.out.println("Notifications Sent:\n");

        for (Notification n : notifications) {
            n.sendNotification();     // Dynamic Method Dispatch
        }
    }
}