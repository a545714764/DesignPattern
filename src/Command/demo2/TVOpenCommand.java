package Command.demo2;

public class TVOpenCommand implements AbstractCommand {
	private Television tv;
	public TVOpenCommand() {
		tv = new Television();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void execute() {
		tv.open();
		// TODO 自动生成的方法存根

	}

}
