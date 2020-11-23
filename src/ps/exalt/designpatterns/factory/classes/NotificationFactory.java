package ps.exalt.designpatterns.factory.classes;

import ps.exalt.designpatterns.factory.enums.NotificationType;
import ps.exalt.designpatterns.factory.interfaces.Notification;

public class NotificationFactory {

    private NotificationFactory() {

    }

    public static Notification createNotification(NotificationType type) {
        if(type == null) {
            return null;
        }
        else if(type.ordinal() == 0) {
            return new SMSNotification();
        }
        else if(type.ordinal() == 1) {
            return new EmailNotification();
        }
        else {
            return new PushNotification();
        }
    }
}
