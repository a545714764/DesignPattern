package observer.demo3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginBean extends JPanel implements ActionListener {
	JLabel labUserName,labPassword;
	JTextField txtUserName;
	JPasswordField txtPassword;
	JButton btnLogin,btnClear;
	
	LoginEventListener lel; //定义一个抽象观察者对象
	LoginEvent le;          //定义一个事件对象用于传输数据
	
	public LoginBean(){
		this.setLayout(new GridLayout(3,2));
		labUserName = new JLabel("User Name:");
		add(labUserName);
		
		txtUserName = new JTextField(20);
		add(txtUserName);
		
		labPassword = new JLabel("Password:");
		add(labPassword);
		
		txtPassword = new JPasswordField(20);
		add(txtPassword);
		
		btnLogin = new JButton("Login");
		add(btnLogin);
		
		btnClear = new JButton("Clear");
		add(btnClear);
		
		btnClear.addActionListener(this);
		btnLogin.addActionListener(this);
		
	}
	
	public void addLoginEventListener(LoginEventListener lel){
		this.lel =lel;
	}
	
	public void fireLoginEvent(Object object,String userName,String password){
		le = new LoginEvent(btnLogin,userName,password);
		lel.validateLogin(le);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(btnLogin == arg0.getSource()){
			String userName = this.txtUserName.getText();
			String password = this.txtPassword.getText();
			
			fireLoginEvent(btnLogin,userName,password);
		}
		
		if(btnClear==arg0.getSource()){
			this.txtUserName.setText("");
			this.txtPassword.setText("");
		}
	}

}
