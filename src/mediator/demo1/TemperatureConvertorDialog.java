package mediator.demo1;

public class TemperatureConvertorDialog extends Dialog {
	public FahrenheitEditBox editBox1;
	public CelsiusEditBox editBox2;
	public TemperatureBar tempBar;
	public FahrenheitLower fLower;
	public CelsiusLower cLower;
	public FahrenheitRaise fRaise;
	public CelsiusRaise cRaise;
	@Override
	public void widgetChanged(Widget widget) {
		if(widget==editBox1){
			double value = editBox1.getText();
			double temp = (value-32)*5/9;
			editBox2.setText(temp);
			tempBar.setBarValue(temp);
		}else if(widget == editBox2){
			double value = editBox2.getText();
			double temp = 9*value/5+32;
			editBox1.setText(temp);
			tempBar.setBarValue(value);
		}else if(widget==tempBar){//温度调节条
			double value = tempBar.getBarValue();
			double temp = 9*value/5+32;
			editBox1.setText(temp);
			tempBar.setBarValue(value);
		}else if(widget==fLower){ //华氏温度降低按钮
			double temp1 = editBox1.getText()-1;
			editBox1.setText(temp1);
			double temp2 = (temp1-32)*5/9;
			editBox2.setText(temp2);
			tempBar.setBarValue(temp2);
		}else if(widget==fRaise){//华氏温度升高按钮
			double temp1 = editBox1.getText()+1;
			editBox1.setText(temp1);
			double temp2 = (temp1-32)*5/9;
			editBox2.setText(temp2);
			tempBar.setBarValue(temp2);
		}else if(widget==cLower){
			//摄氏温度降低按钮
			double temp1 = editBox2.getText()-1;
			editBox2.setText(temp1);
			double temp2 = 9*temp1/5+32;
			editBox2.setText(temp2);
			tempBar.setBarValue(temp1);
		}else if(widget==cRaise){
			//摄氏温度升高按钮
			double temp1 = editBox2.getText()+1;
			editBox2.setText(temp1);
			double temp2 = 9*temp1/5+32;
			editBox2.setText(temp2);
			tempBar.setBarValue(temp1);
		}
		
	}
	
}
