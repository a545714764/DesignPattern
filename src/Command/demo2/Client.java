package Command.demo2;
/*
 * 命令模式实例2之电视机遥控器
 * 电视机是请求的接受者，遥控器是请求的发送者，遥控器上有一些按钮，不同的按钮对应电视机的
 * 不同操作。抽象命令角色由一个命令接口来扮演，由三个具体的命令类实现了抽象命令接口，这三个
 * 具体命令类分别代表三种操作：打开电视机、关闭电视机、和切换频道。显然，电视机遥控器就是
 * 一个典型的命令模式应用实例。
 * 符合开闭原则
 */
public class Client {

	public static void main(String[] args) {
		AbstractCommand openCommand,closeCommand,changeCommand;
		
		openCommand = new TVOpenCommand();
		closeCommand = new TVCloseCommand();
		changeCommand = new TVChangeCommand();
		
		Controller control = new Controller(openCommand, closeCommand, changeCommand);
		
		control.open();
		control.change();
		control.close();

	}

}
