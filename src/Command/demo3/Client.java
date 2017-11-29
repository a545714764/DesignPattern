package Command.demo3;
/*
 * 命令模式实例3之简单加法器(撤销操作的实现)
 */
public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
