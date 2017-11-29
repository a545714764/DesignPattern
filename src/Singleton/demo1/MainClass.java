package Singleton.demo1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
/*
 * ʹ�õ���ģʽ���һ�����ĵ�����(ע:��java AWT/Swing ������ʹ��JDesktopPane��
 * JInternalFrame��ʵ��),Ҫ������������ĳ���ڲ��Ӵ���ֻ��ʵ����һ�μ�ֻ�ܵ���һ����
 * ͬ���Ӵ���
 */
public class MainClass extends JFrame {
	private JButton button;
	private JDesktopPane desktopPane;
	private SubFrame iFrame = null;
	public MainClass(){
		super("������");
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
		button = new JButton("��������һ���ڲ�����");
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
