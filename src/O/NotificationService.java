package O;

public class NotificationService {

    //bad code : not following O(open/close principle)
    public boolean sendNotification(String type, String message) {
        if("EMAIL".equalsIgnoreCase(type) && !message.isBlank()) {
            System.out.println("Sending Email Notification : " + message);
            return true;
        }
        if("SMS".equalsIgnoreCase(type) && !message.isBlank()) {
            System.out.println("Sending SMS Notification : " + message);
            return true;
        }
        // If we want to add WHATSAPP type, we need to modify this method again.

        return false;
    }

    private Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public boolean sendNotification(String message) {
        if(!message.isBlank()) {
            this.notification.sendNotification(message);
            return true;
        }
        return false;
    }
}
