package O;

public class WhatsAppNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending WhatsApp Notification : " + message);
    }
}
