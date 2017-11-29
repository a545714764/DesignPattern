package mediator.demo1;

public class TemperatureBar extends Widget {
	private double barValue = 10;
	public void setBarValue(double value){
		this.barValue = value;
		System.out.println("温度调节条值为:"+ this.barValue+"摄氏度.");
	}
	public double getBarValue(){
		System.out.println("获取温度调节条的摄氏温度:" + this.barValue+".");
		return this.barValue;
	}
	@Override
	public void changed() {
		// TODO Auto-generated method stub
		dialog.widgetChanged(this);
	}

}
