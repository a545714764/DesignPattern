package mediator.demo1;
/*
 * �ó�����ͬһ��������ʾ�����¶�(Fahrenheit)�����϶��¶�(Celsius)
 * �û�����ͨ��"����","����",��ť���ұߵ��¶ȵ������������¶�,Ҳ����ֱ��ͨ���ı����������¶�
 * �����¶Ⱥͻ����¶Ƚ�ͬʱ�ı�,���¶ȵ�����Ҳ��һ���µ���.
 * ʹ���н���ģʽ��Ƹ�ϵͳ,������ͼ��ģ��ʵ��
 */
public class Client {

	public static void main(String[] args) {
		TemperatureConvertorDialog dialog;
		dialog = new TemperatureConvertorDialog();
		FahrenheitEditBox editBox1 = new FahrenheitEditBox();
		CelsiusEditBox editBox2 = new CelsiusEditBox();
		TemperatureBar tempBar = new TemperatureBar();
		FahrenheitLower fLower = new FahrenheitLower();
		CelsiusLower cLower = new CelsiusLower();
		FahrenheitRaise fRaise = new FahrenheitRaise();
		CelsiusRaise cRaise = new CelsiusRaise();
		editBox1.setDialog(dialog);
		editBox2.setDialog(dialog);
		tempBar.setDialog(dialog);
		fLower.setDialog(dialog);
		cLower.setDialog(dialog);
		fRaise.setDialog(dialog);
		cRaise.setDialog(dialog);
		dialog.showDialog();
		dialog.editBox1 = editBox1;
		dialog.editBox2 = editBox2;
		dialog.tempBar = tempBar;
		dialog.fLower = fLower;
		dialog.cLower = cLower;
		dialog.fRaise = fRaise;
		dialog.cRaise = cRaise;
		editBox1.changed();
		System.out.println("------------------------");
		fRaise.changed();
		System.out.println("------------------------");
		tempBar.setBarValue(20);
		tempBar.changed();
		System.out.println("------------------------");

	}

}
