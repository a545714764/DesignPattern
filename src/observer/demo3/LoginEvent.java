package observer.demo3;

import java.util.EventObject;

public class LoginEvent extends EventObject {
	private String userName;
	private String password;
	public LoginEvent(Object arg0,String userName,String password) {
		super(arg0);
		this.userName = userName;
		this.password = password;
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
