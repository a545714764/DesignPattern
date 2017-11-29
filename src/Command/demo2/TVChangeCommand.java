package Command.demo2;

public class TVChangeCommand implements AbstractCommand {
	private Television tv;
	public TVChangeCommand() {
		tv = new Television();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void execute() {
		tv.changeChannel();
		// TODO 自动生成的方法存根

	}

}
