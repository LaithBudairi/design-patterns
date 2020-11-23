package ps.exalt.designpatterns.Strategy.classes;

import ps.exalt.designpatterns.Strategy.interfaces.JumpBehavior;

public class LongJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Long Jump");
    }
}
