package ps.exalt.designpatterns.Strategy.classes;

import ps.exalt.designpatterns.Strategy.interfaces.JumpBehavior;

public class ShortJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Short Jump");
    }
}
