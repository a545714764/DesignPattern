package decorator.demo3;
/*
 * ��͸��װ��ģʽʵ��3֮���ν��
 * 
 * ���ν���ڱ���֮ǰ��һ������,��������½�����ƶ�.������ɻ�����֮������ܹ���½�����ƶ�
 * ֮��,������˵��;�����Ҫ,�������Ա�ɷɻ�,������½�����ƶ�������������з���.
 */
public class Client {

	public static void main(String[] args) {
		Transform camaro;
		camaro = new Car();
		camaro.move();
		System.out.println("-------------------------");
		Robot bumblebee = new Robot(camaro);
		bumblebee.move();
		bumblebee.say();
	}

}
