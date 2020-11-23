package ps.exalt.designpatterns.factory.classes;

import ps.exalt.designpatterns.factory.interfaces.Notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Email Notification...");
    }
}
