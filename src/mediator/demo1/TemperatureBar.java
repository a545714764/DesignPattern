package mediator.demo1;

public class TemperatureBar extends Widget {
	private double barValue = 10;
	public void setBarValue(double value){
		this.barValue = value;
		System.out.println("�¶ȵ�����ֵΪ:"+ this.barValue+"���϶�.");
	}
	public double getBarValue(){
		System.out.println("��ȡ�¶ȵ������������¶�:" + this.barValue+".");
		return this.barValue;
	}
	@Override
	public void changed() {
		// TODO Auto-generated method stub
		dialog.widgetChanged(this);
	}

}
