package Singleton.demo1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
/*
 * 使用单例模式设计一个多文档窗口(注:在java AWT/Swing 开发可使用JDesktopPane和
 * JInternalFrame来实现),要求在主窗体中某个内部子窗体只能实例化一次即只能弹出一个相
 * 同的子窗体
 */
public class MainClass extends JFrame {
	private JButton button;
	private JDesktopPane desktopPane;
	private SubFrame iFrame = null;
	public MainClass(){
		super("主窗体");
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
		button = new JButton("单击创建一个内部窗体");
		button.addActionListener(new BtListener());
		c.add(button, BorderLayout.SOUTH);
		
		desktopPane = new JDesktopPane();
		c.add(desktopPane);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.show();
	}
	
	class BtListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(iFrame!=null){
				desktopPane.remove(iFrame);
			}
			iFrame=SubFrame.getFrame();
			desktopPane.add(iFrame);
		}
	}
	public static void main(String[] args) {
		new MainClass();
	}
}
