package PrototypePattern.demo0;
/*
 * 原型模式一般形式
 */
public class Client {
	public static void main(String[] args) {
		PrototypeDemo obj1 = new PrototypeDemo();
		PrototypeDemo obj2 = (PrototypeDemo) obj1.clone();
	}
}
