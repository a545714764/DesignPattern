package mediator.demo1;

public class FahrenheitLower extends Button {
	public void changed(){
		System.out.println("单击华氏温度降低按钮:");
		dialog.widgetChanged(this);
	}
}
