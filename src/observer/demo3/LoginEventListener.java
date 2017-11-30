package observer.demo3;

import java.util.EventListener;

public interface LoginEventListener extends EventListener {
	public void validateLogin(LoginEvent event);
}
