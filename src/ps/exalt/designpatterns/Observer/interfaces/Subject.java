package ps.exalt.designpatterns.Observer.interfaces;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
