package Command.demo0;

public class ConcreteCommand extends Command {
	private Receiver receiver;
	@Override
	public void execute() {
		receiver.action();
		// TODO 自动生成的方法存根

	}

}
