package ps.exalt.designpatterns.Strategy.classes;

import ps.exalt.designpatterns.Strategy.interfaces.JumpBehavior;
import ps.exalt.designpatterns.Strategy.interfaces.KickBehavior;

public class ChunLi extends Fighter {

    public ChunLi(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("Chun Li");
    }
}
