package Command.demo2;

public class TVCloseCommand implements AbstractCommand {
	private Television tv;
	public TVCloseCommand() {
		tv = new Television();
		// TODO �Զ����ɵĹ��캯�����
	}
	@Override
	public void execute() {
		tv.close();
		// TODO �Զ����ɵķ������

	}

}
