package mediator.demo2;
/*
 * �н���ģʽʵ��2֮����������
 * ĳ��̳ϵͳ������һ������������,������̳��Աͨ���������ҽ�����Ϣ����,��ͨ��Ա(CommonMemeber)���Ը�����
 * ��Ա�����ı���Ϣ,��ʯ��Ա(DiamondMember)�ȿ��Ը�������Ա�����ı���Ϣ,�����Է���ͼƬ��Ϣ.�������ҿ���
 * �Բ����ַ����й���,��"��"���ַ�;�����ԶԷ��͵�ͼƬ��С���п���.���н���ģʽ��Ƹ�����������
 */
public class Client {

	public static void main(String[] args) {
		AbstractChatroom happyChat = new ChatGroup();
		
		Member m1,m2,m3,m4,m5;
		m1 = new DiamondMember("����");
		m2 = new DiamondMember("����");
		m3 = new CommonMember("����");
		m4 = new CommonMember("С��");
		m5 = new CommonMember("С��");
		
		happyChat.register(m1);
		happyChat.register(m2);
		happyChat.register(m3);
		happyChat.register(m4);
		happyChat.register(m5);
		
		m1.sendText("����", "����,���!");
		m2.sendText("����", "����,���!");
		m1.sendText("����", "������������,����");
		m2.sendImage("����", "һ���ܴ�ܴ��̫��!");
		m2.sendImage("����", "̫��");
		m3.sendText("С��", "����������?");
		m3.sendText("С��", "����������");
		m4.sendText("����", "û����,лл");
		m5.sendText("����", "��Ҳû����");
		m5.sendImage("����", "лл");
		

	}

}
