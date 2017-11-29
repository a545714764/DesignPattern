package mediator.demo1;

public class FahrenheitEditBox extends Widget {
	private double value = 50;
	public void setText(double value){
		this.value = value;
		System.out.println("摄氏温度设置为"+ this.value+".");
	}
	public double getText(){
		System.out.println("获取文本框中的摄氏温度:"+this.value+".");
		return this.value;
	}
	@Override
	public void changed() {
		// TODO Auto-generated method stub
		System.out.println("摄氏温度文本框值改变");
		dialog.widgetChanged(this);
	}

}
