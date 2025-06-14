package O;

public class Main {

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        NotificationService notificationService = new NotificationService(emailNotification);
        System.out.println(notificationService.sendNotification("Hello There, From Email!"));

        WhatsAppNotification whatsAppNotification = new WhatsAppNotification();
        notificationService.setNotification(whatsAppNotification);
        System.out.println(notificationService.sendNotification("Hello There, From WhatsApp!"));
    }
}
