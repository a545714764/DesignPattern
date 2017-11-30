package observer.demo2;

/*
 * 观察者模式实例2之猫、狗与老鼠
 * 假设猫是老鼠和狗的观察目标，老鼠和狗屎观察者，猫叫老鼠跑，狗也跟着叫，使用观察者模式
 * 描述该过程。
 */
public class Client {
	public static void main(String[] args) {
		MySubject subject = new Cat();
		
		MyObserver o1,o2,o3;
		o1 = new Mouse();
		o2 = new Mouse();
		o3 = new Dog();
		
		subject.attach(o1);
		subject.attach(o2);
		subject.attach(o3);
		subject.cry();
		
	}
	
}
