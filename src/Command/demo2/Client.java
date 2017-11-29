package Command.demo2;
/*
 * ����ģʽʵ��2֮���ӻ�ң����
 * ���ӻ�������Ľ����ߣ�ң����������ķ����ߣ�ң��������һЩ��ť����ͬ�İ�ť��Ӧ���ӻ���
 * ��ͬ���������������ɫ��һ������ӿ������ݣ������������������ʵ���˳�������ӿڣ�������
 * ����������ֱ�������ֲ������򿪵��ӻ����رյ��ӻ������л�Ƶ������Ȼ�����ӻ�ң��������
 * һ�����͵�����ģʽӦ��ʵ����
 * ���Ͽ���ԭ��
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
