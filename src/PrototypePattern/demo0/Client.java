package PrototypePattern.demo0;
/*
 * ԭ��ģʽһ����ʽ
 */
public class Client {
	public static void main(String[] args) {
		PrototypeDemo obj1 = new PrototypeDemo();
		PrototypeDemo obj2 = (PrototypeDemo) obj1.clone();
	}
}
