package mediator.demo1;
//���󴰿ڲ�����:����ͬ����
public abstract class Widget {
	protected Dialog dialog;
	public void setDialog(Dialog dialog){
		this.dialog = dialog;
	}
	public abstract void changed();
}
