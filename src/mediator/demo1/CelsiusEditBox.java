package mediator.demo1;

public class CelsiusEditBox extends Widget {
	private double value = 10;
	public void setText(double value){
		this.value = value;
		System.out.println("�����¶�����Ϊ"+ this.value+".");
	}
	public double getText(){
		System.out.println("��ȡ�ı����еĻ����¶�:"+this.value+".");
		return this.value;
	}
	@Override
	public void changed() {
		// TODO Auto-generated method stub
		System.out.println("�����¶��ı���ֵ�ı�");
		dialog.widgetChanged(this);
	}

}
