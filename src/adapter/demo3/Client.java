package adapter.demo3;
/*
 * ������ʵ��3֮����������
 * ����Ҫ���һ������ģ����ֶ�����Ϊ�Ļ�����,�ڻ������ж�����һϵ�з���,������˽к�����cry()��
 * �������ƶ�����move()�ȡ����ϣ���ڲ��޸����д���Ļ�����ʹ�û������ܹ���һ����,��һ����,
 * ����ʹ��������ģʽ������ϵͳ���
 */
public class Client {

	public static void main(String[] args) {
		Robot robot = (Robot) XMLUtil.getBean();
		robot.cry();
		robot.move();
	}

}
