package mediator.demo1;

public class FahrenheitEditBox extends Widget {
	private double value = 50;
	public void setText(double value){
		this.value = value;
		System.out.println("�����¶�����Ϊ"+ this.value+".");
	}
	public double getText(){
		System.out.println("��ȡ�ı����е������¶�:"+this.value+".");
		return this.value;
	}
	@Override
	public void changed() {
		// TODO Auto-generated method stub
		System.out.println("�����¶��ı���ֵ�ı�");
		dialog.widgetChanged(this);
	}

}
