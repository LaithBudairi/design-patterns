package ps.exalt.designpatterns.state.interfaces;

import ps.exalt.designpatterns.state.classes.AlertStateContext;

public interface MobileAlertState {
    public void alert(AlertStateContext ctx);
}
