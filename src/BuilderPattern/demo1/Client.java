package BuilderPattern.demo1;
/*
 * ĳ��Ϸ����������ɫ������������,��ͬ���͵������ɫ,���Ա����͡���װ�����͵�
 * �ⲿ������������,ʹ�ý�����ģʽ���������ɫ����,Ҫ�������ͼ�����ʵ��
 */
public class Client {

	public static void main(String[] args) {
		ActorController ac = new ActorController();
		ActorBuilder ab;
		ab = new AngelBuilder();
		Actor angel;
		angel = ac.construct(ab);
		String type = angel.getType();
		System.out.println(type+"�����:");
		System.out.println("�Ա�:"+angel.getSex());
		System.out.println("����:"+angel.getFace());
		System.out.println("��װ:"+angel.getCostume());
		System.out.println("����:"+angel.getHairsytle());
		
	}

}
