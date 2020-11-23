package ps.exalt.designpatterns.Strategy.classes;

import ps.exalt.designpatterns.Strategy.interfaces.KickBehavior;

public class LightningKick implements KickBehavior {
    @Override
    public void kick() {
        System.out.println("Lightning Kick");
    }
}
