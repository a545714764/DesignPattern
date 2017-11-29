package flyweight.demo1;
/*
 * ��Ԫģʽ
 * ʹ����Ԫģʽ���һ��Χ�����,��ϵͳ��ֻ����һ����������һ���������,�������ǿ��������̵Ĳ�ͬλ����ʾ���
 * Ҫ��ʹ�ü򵥹���ģʽ�͵���ģʽʵ����Ԫ����������
 */
public class Client {

	public static void main(String[] args) {
		IgoChessman black1,black2,black3,white1,white2;
		IgoChessmanFactory factory;
		factory = IgoChessmanFactory.getInstance();
		black1 = factory.getIgoChessman("b");
		black2 = factory.getIgoChessman("b");
		black3 = factory.getIgoChessman("b");
		System.out.println("�ж����ź����Ƿ���ͬ:"+ (black1==black2));
		white1 = factory.getIgoChessman("w");
		white2 = factory.getIgoChessman("w");
		System.out.println("�ж����Ű����Ƿ���ͬ:"+ (white1==white2));
		black1.locate(new Coordiantes(1, 2));
		black2.locate(new Coordiantes(3, 4));
		black3.locate(new Coordiantes(1, 3));
		white1.locate(new Coordiantes(2, 5));
		white2.locate(new Coordiantes(2, 4));
	}

}
