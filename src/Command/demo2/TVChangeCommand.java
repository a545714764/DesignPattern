package Command.demo2;

public class TVChangeCommand implements AbstractCommand {
	private Television tv;
	public TVChangeCommand() {
		tv = new Television();
		// TODO �Զ����ɵĹ��캯�����
	}
	@Override
	public void execute() {
		tv.changeChannel();
		// TODO �Զ����ɵķ������

	}

}
