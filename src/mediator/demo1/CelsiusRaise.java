package mediator.demo1;

public class CelsiusRaise extends Button {
	public void changed(){
		System.out.println("单击摄氏温度升高按钮:");
		dialog.widgetChanged(this);
	}
}
