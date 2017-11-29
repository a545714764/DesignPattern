package mediator.demo1;
//抽象窗口部件类:抽象同事类
public abstract class Widget {
	protected Dialog dialog;
	public void setDialog(Dialog dialog){
		this.dialog = dialog;
	}
	public abstract void changed();
}
