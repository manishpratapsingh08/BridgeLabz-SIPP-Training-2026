class Notification {

    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Notification Sent");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("Email sent to " + recipientName + " : " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("SMS sent to " + recipientName + " : " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName + " : " + message);
    }
}

    class Main {
    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Manish", "Welcome"),
                new SMSNotification("Rahul", "OTP:1234"),
                new PushNotification("Amit", "New Offer")
        };

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}