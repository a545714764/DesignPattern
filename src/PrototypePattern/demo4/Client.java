package PrototypePattern.demo4;
/*
 *��ԭ�͹�������ԭ��ģʽ
 *ԭ�͹�����(Prototype Manager)��ɫ��������ԭ����Ķ���,����¼ÿһ���������Ķ���
 *ԭ�͹������������빤������,���ж�����һ���������ڴ洢ԭ�Ͷ���,�����Ҫĳ�������һ��
 *��¡,����ͨ�����Ƽ����ж�Ӧ��ԭ�Ͷ��������.��ԭ�͹���������Գ���ԭ������б��,�Ա�
 *��չ 
 */
public class Client {

	public static void main(String[] args) {
		PrototypeManager pm = new PrototypeManager();
		
		MyColor obj1 = (MyColor)pm.getColor("red");
		obj1.display();
		
		MyColor obj2 = (MyColor)pm.getColor("red");
		obj2.display();
		
		System.out.println(obj1==obj2);

	}

}
