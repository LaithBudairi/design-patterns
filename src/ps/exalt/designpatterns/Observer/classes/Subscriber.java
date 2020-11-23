package ps.exalt.designpatterns.Observer.classes;

import ps.exalt.designpatterns.Observer.interfaces.Observer;

public class Subscriber implements Observer {
    private int videoCount;
    private int subscribersCount;

    @Override
    public void update(int videoCount, int subscriberCount) {
        this.videoCount = videoCount;
        this.subscribersCount = subscriberCount;

        System.out.println("VideoCount from subscriber: " + videoCount + ", and subscriberCount: " + subscriberCount);
    }
}