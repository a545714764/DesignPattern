package Command.demo3;
/*
 * ����ģʽʵ��3֮�򵥼ӷ���(����������ʵ��)
 */
public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		CalculatorForm form = new CalculatorForm();
		AbstractCommand command;
		command = new ConcreteCommand();
		form.setCommand(command);
		
		form.compute(10);
		form.compute(5);
		form.compute(10);
		form.undo();

	}

}
