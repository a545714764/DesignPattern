package decorator.demo2;

import java.util.Random;

/*
 * ��ϲ������������Ϸ��ϲ���򱻻�̫��׷��ϲ�������5��������̫��ÿҧ��ϲ����һ�Σ�ϲ�����Ҫ��һ���������ӵĹ�����ϲ������ԳԵ�����
 * ƻ�����ԡ���ƻ�������Ը�ϲ������ϱ����֣��ԡ���ƻ�������Լӿ�ϲ�������ٶȣ��ԡ���ƻ��������ʹϲ��������ˮ�ܡ�Ӧ��װ��ģʽ����JAVA
 * ����̨Ӧ�ó���ʵ�ָ���ơ����Ƹ�ģʽ��UMLͼ��
 */
/*
 * ��Ϸ��ƣ�ÿ�غ���һ������¼���
 * 1.���ԳԵ�����ƻ���е�һ��
 * 2.����ˮ�ش�
 * 3.��̫�Ǻ�ϲ����ӵ����ͬ�ٶȣ�ÿ�غ�step++��
 * 4.��̫����ԭ��step=0��ϲ������Զ��step=5
 * 5.ϲ�������������
 * 6.����̫��wolfStep == ϲ���� yangStep ����ֵ-1
 */
public class Client {
	static YangYang yang = Xiyangyang.getInstance();
	private int huihe = 1;
	public static int wolfStep = 0;
	public static int yangStep = 5;
	public static int shui = 1;
	public static void main(String[] args) {
		Random random = new Random();
		while(true){
			int result = random.nextInt(4)+1;
			shui = random.nextInt(2)+1;
			System.out.println("result:"+result);
			System.out.println("shui"+shui);
			game(yang,shui,result);
			System.out.println("ϲ��������"+yangStep+"��");
			System.out.println("��̫������"+wolfStep+"��");
			System.out.println("ϲ�������̫�ǵľ���Ϊ��"+(yangStep-wolfStep));
			if(wolfStep==yangStep){
				break;
			}
		}
	}
	public static void game(YangYang yangyang,int shui,int result){
		if(shui==1){
			switch(result){
			case 1:
				yang = new RedAppleDecorator(yangyang);
				System.out.println("���˺�ƻ��Ƭ");
				yangyang.redTime = 3;
				wolfStep++;
				yang.run();
				break;
			case 3:
				yang = new GreenAppleDecorator(yangyang);
				System.out.println("����lvƻ��Ƭ");
				yangyang.greenTime = 3;
				wolfStep++;
				yang.run();
				break;
			default:
				break;
			
			}
		}else{
			if(result==2){
				yang = new YellowAppleDecorator(yangyang);
				System.out.println("����yƻ��Ƭ");
				yangyang.yellowTime = 3;
				yang.run();
				wolfStep++;
			}else{
				if(yangyang.yellowTime>0){
					System.out.println("��Ȼ��ˮ,��ϲ������˻�ƻ��,��Խ��ˮ");
					yangStep++;
				}
				System.out.println("ǰ����ˮϲ�����ܲ����ˣ�step����");
				wolfStep++;
			}
			
		}
		
	}

}
