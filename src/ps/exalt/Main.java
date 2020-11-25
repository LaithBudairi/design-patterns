package ps.exalt;

import ps.exalt.designpatterns.Observer.classes.Subscriber;
import ps.exalt.designpatterns.Observer.classes.Youtuber;
import ps.exalt.designpatterns.Strategy.classes.*;
import ps.exalt.designpatterns.Strategy.interfaces.JumpBehavior;
import ps.exalt.designpatterns.Strategy.interfaces.KickBehavior;
import ps.exalt.designpatterns.adapter.classes.Line;
import ps.exalt.designpatterns.adapter.classes.LineAdapter;
import ps.exalt.designpatterns.adapter.classes.Rectangle;
import ps.exalt.designpatterns.adapter.classes.RectangleAdapter;
import ps.exalt.designpatterns.adapter.interfaces.Shape;
import ps.exalt.designpatterns.builder.classes.CivilEngineer;
import ps.exalt.designpatterns.builder.classes.House;
import ps.exalt.designpatterns.builder.classes.IglooHouseBuilder;
import ps.exalt.designpatterns.builder.interfaces.HouseBuilder;
import ps.exalt.designpatterns.factory.classes.NotificationFactory;
import ps.exalt.designpatterns.factory.enums.NotificationType;
import ps.exalt.designpatterns.factory.interfaces.Notification;
import ps.exalt.designpatterns.singleton.Singleton;
import ps.exalt.designpatterns.state.classes.AlertStateContext;
import ps.exalt.designpatterns.state.classes.Silent;

public class Main {

    public static void main(String[] args) {
	    // Singleton
        StringBuilder firstName = Singleton.getInstance();
        firstName.append("Laith ");

        System.out.println(firstName);

        StringBuilder lastName = Singleton.getInstance();
        lastName.append("Budairi");

        System.out.println(lastName);
        System.out.println();

        // Factory
        Notification notification = NotificationFactory.createNotification(NotificationType.PUSH);
        notification.notifyUser();
        System.out.println();

        // Adapter
        Shape[] shapes = {new RectangleAdapter(new Rectangle()),
                new LineAdapter(new Line())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
        System.out.println();

        // Observer
        Youtuber youtuber = new Youtuber();

        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();

        youtuber.register(s1);
        youtuber.register(s2);

        System.out.println("Before Update: \n" + youtuber.toString() + "\n");

        youtuber.dataChanged();
        System.out.println("Youtuber s1 unsubscribed :(\n");
        youtuber.unregister(s1);

        youtuber.dataChanged();

        // Strategy
        JumpBehavior shortJump = new ShortJump();
        JumpBehavior longJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        // Make a fighter with desired behaviors
        Fighter ken = new Ken(tornadoKick,shortJump);
        ken.display();

        // Test behaviors
        ken.punch();
        ken.kick();
        ken.jump();

        // Change behavior dynamically (algorithms are
        // interchangeable)
        ken.setJumpBehavior(longJump);
        ken.jump();

        System.out.println();

        // Builder
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house);
        System.out.println();

        // State
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();

    }
}
