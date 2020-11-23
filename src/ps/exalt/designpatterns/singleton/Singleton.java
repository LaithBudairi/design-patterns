package ps.exalt.designpatterns.singleton;

public class Singleton {

    private volatile static StringBuilder string;

    private Singleton() {

    }

    public static StringBuilder getInstance() {
        if(string == null) {
            synchronized (Singleton.class) {
                if(string == null) {
                    string = new StringBuilder();
                }
            }
        }
        return string;
    }

}