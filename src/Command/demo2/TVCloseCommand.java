package Command.demo2;

public class TVCloseCommand implements AbstractCommand {
	private Television tv;
	public TVCloseCommand() {
		tv = new Television();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void execute() {
		tv.close();
		// TODO 自动生成的方法存根

	}

}
