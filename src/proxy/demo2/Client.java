package proxy.demo2;
/*
 * ��������ģʽʵ��2֮��̳Ȩ�޿��ƴ���
 * ��һ����̳����ע���û����ο͵�Ȩ�޲�ͬ,��ע����û�ӵ�з������޸��Լ���ע����Ϣ���޸��Լ������ӵ�
 * ����;���ο�ֻ�ܿ������˷�������,û������Ȩ�ޡ�ʹ�ô���ģʽ����Ƹ�Ȩ�޹���ģ�顣
 * �ڱ�ʵ��������ʹ�ô���ģʽ�еı��������ô������ڿ��ƶ�һ������ķ��ʣ����Ը���ͬ���û��ṩ��ͬ��
 * ���ʹ��Ȩ��
 */
public class Client {

	public static void main(String[] args) {
		AbstractPermission permission;
		permission = (AbstractPermission) XMLUtil.getBean();
		
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
		System.out.println("--------------------");
		permission.setLevel(1);
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();

	}

}
