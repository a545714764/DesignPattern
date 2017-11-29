package Singleton.demo1;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class SubFrame extends JInternalFrame {
	private static SubFrame frame;
	private SubFrame(){
		super("×Ó´°Ìå",true,true,true,false);
		this.setLocation(20, 20);
		this.setSize(200,200);
		this.addInternalFrameListener(new MyIFListener());
		this.setVisible(true);
	}	
	public static SubFrame getFrame(){
		if(frame==null){
			frame = new SubFrame();
		}
		return frame;
	}
	class MyIFListener extends InternalFrameAdapter{
		public void internalFrameClosing(InternalFrameEvent e){
			if(frame!=null){
				frame =null;
			}
		}
	}

}
