package Command.demo2;

public class TVOpenCommand implements AbstractCommand {
	private Television tv;
	public TVOpenCommand() {
		tv = new Television();
		// TODO �Զ����ɵĹ��캯�����
	}
	@Override
	public void execute() {
		tv.open();
		// TODO �Զ����ɵķ������

	}

}
