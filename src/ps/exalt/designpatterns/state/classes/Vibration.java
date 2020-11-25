package ps.exalt.designpatterns.state.classes;

import ps.exalt.designpatterns.state.interfaces.MobileAlertState;

public class Vibration implements MobileAlertState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("vibration...");
    }

}