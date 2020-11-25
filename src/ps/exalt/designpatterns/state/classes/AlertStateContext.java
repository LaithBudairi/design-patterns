package ps.exalt.designpatterns.state.classes;

import ps.exalt.designpatterns.state.interfaces.MobileAlertState;

public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext()
    {
        currentState = new Vibration();
    }

    public void setState(MobileAlertState state)
    {
        currentState = state;
    }

    public void alert()
    {
        currentState.alert(this);
    }
}
