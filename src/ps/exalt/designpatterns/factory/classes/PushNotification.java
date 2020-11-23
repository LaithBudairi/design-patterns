package ps.exalt.designpatterns.factory.classes;

import ps.exalt.designpatterns.factory.interfaces.Notification;

public class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Push Notification...");
    }
}
