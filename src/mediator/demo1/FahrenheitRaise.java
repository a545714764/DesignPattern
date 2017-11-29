package mediator.demo1;

public class FahrenheitRaise extends Button {
	public void changed(){
		System.out.println("单击华氏温度升高按钮:");
		dialog.widgetChanged(this);
	}
}
