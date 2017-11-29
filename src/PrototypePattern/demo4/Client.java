package PrototypePattern.demo4;
/*
 *带原型管理器的原型模式
 *原型管理器(Prototype Manager)角色创建具体原型类的对象,并记录每一个被创建的对象
 *原型管理器的作用与工厂相似,其中定义了一个集合用于存储原型对象,如果需要某个对象的一个
 *克隆,可以通过复制集合中对应的原型对象来获得.在原型管理器中针对抽象原型类进行编程,以便
 *扩展 
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
