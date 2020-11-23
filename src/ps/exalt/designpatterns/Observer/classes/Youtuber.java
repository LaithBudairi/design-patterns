package ps.exalt.designpatterns.Observer.classes;

import ps.exalt.designpatterns.Observer.interfaces.Observer;
import ps.exalt.designpatterns.Observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Youtuber implements Subject {
    private int videoCount;
    private int subscriberCount;
    private List<Observer> subscribers;

    public Youtuber() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        subscribers.remove(subscribers.indexOf(o));
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(videoCount, subscriberCount);
        }
    }

    public void dataChanged() {
        videoCount = getVideoCount();
        subscriberCount = getSubscriberCount();

        System.out.println("VideoCount from Youtuber: " + videoCount + ", and subscriberCount: " + subscriberCount);

        notifyObservers();
        System.out.println();
    }

    @Override
    public String toString() {
        return "Youtuber{" +
                "videoCount=" + videoCount +
                ", subscriberCount=" + subscriberCount +
                '}';
    }

    public int getVideoCount() {
        return 66;
    }

    public int getSubscriberCount() {
        return 2000;
    }


}
