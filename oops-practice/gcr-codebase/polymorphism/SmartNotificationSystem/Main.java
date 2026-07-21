package gcr_codebase.Polymorphism.SmartNotificationSystem;

public class Main {

    public static void main(String[] args) {

        Notification[] notifications = new Notification[3];

        notifications[0] = new EmailNotification("Rahul", "Welcome to our service!");
        notifications[1] = new SMSNotification("Priya", "Your OTP is 456789.");
        notifications[2] = new PushNotification("Amit", "Your order has been delivered.");

        System.out.println("----- Sent Notifications -----");

        for (Notification notification : notifications) {
            notification.sendNotification();
            System.out.println();
        }
    }
}