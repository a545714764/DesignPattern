package decorator.demo2_1;

import java.util.Random;

/*
 * ��ϲ������������Ϸ��ϲ���򱻻�̫��׷��ϲ�������5��������̫��ÿҧ��ϲ����һ�Σ�ϲ�����Ҫ��һ���������ӵĹ�����ϲ������ԳԵ�����
 * ƻ�����ԡ���ƻ�������Ը�ϲ������ϱ����֣��ԡ���ƻ�������Լӿ�ϲ�������ٶȣ��ԡ���ƻ��������ʹϲ��������ˮ�ܡ�Ӧ��װ��ģʽ����JAVA
 * ����̨Ӧ�ó���ʵ�ָ���ơ����Ƹ�ģʽ��UMLͼ��
 */
public class Client {
	public static void main(String[] args) {
		YangYang yang,yang1,yang2,yang3;
		yang = new Xiyangyang();
		yang1 = new GreenAppleDecorator(yang);
		yang2 = new RedAppleDecorator(yang1);
		yang3 = new YellowAppleDecorator(yang2);
		yang3.run();
		
		
		
	}

}
