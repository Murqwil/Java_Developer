package M_2C_M_C;

public class NotificationService {
    public void sendNotification(String message, Visitor visitor) {
        System.out.println("Уведомление для " + visitor.getName() + ": " + message);
    }
}

