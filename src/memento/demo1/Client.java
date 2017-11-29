package memento.demo1;
/*
 * ĳģ��ս����ϷΪ�˸�����ṩ���õ��û�����,����Ϸ�����п�������һ���ָ���
 * ��¼��ǰ��Ϸ����,����ں�����Ϸ����ҽ�ɫ"��������",���Է��ص���ǰ����
 * ������ָ��㿪ʼ������Ϸ.��ʹ�ñ���¼ģʽ��Ƹù���,������ͼ�����ʵ��
 */
public class Client {

	public static void main(String[] args) {
		GameScene scene = new GameScene();
		Caretaker ct = new Caretaker();
		scene.setScene("������");
		scene.setLifeValue(3);
		System.out.println("ԭʼ״̬:");
		scene.display();
		ct.setSceneMemento(scene.save());
		System.out.println("-----------------------");
		
		scene.setScene("ħ��");
		scene.setLifeValue(0);
		System.out.println("����״̬:");
		scene.display();
		System.out.println("-----------------------");
		
		scene.restore(ct.getSceneMemento());
		System.out.println("�ָ���ԭʼ״̬:");
		scene.display();
		System.out.println("-----------------------");

	}

}
