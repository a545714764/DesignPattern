package adapter.demo1;
/*
 * һ������Ŷӿ�����ͼϵͳ�������Բ����(Circle)�����ζ���(Rectangle)���߶���(Line)
 * ��֧��Draw()������������ͨ��Draw()��������ͼ�Ρ�Ϊ�˼ӿ���Ŀ���ȣ����Ƕȶ���(Angle)
 * ���ƹ��ܽ����˺����Ŷ�ʵ�֡��������Ŷӽ��Ƕȶ�����ƺ�����Ϊ��DrawAngle()����ͼϵͳ��
 * �����û����û������⣬ϣ����ͳһ�ĵ��ã����ü�̫�����Ӧ��������ģʽ����JAVA����̨Ӧ
 * �ó������Ƹ���ơ����Ƹ�ģʽ��UMLͼ��
 */
public class Client {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.Draw();

		OperationAdapter operationAdapter = new OperationAdapter(new Adaptee());
		operationAdapter.Draw();

	}

}
