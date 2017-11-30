package observer.demo0;
/*
 * 观察者模式一般形式：
 * 观察者模式也叫发布-订阅模式（Publish/Subscribe）、模型-视图（Model/View）模式、
 * 源-监听器（Source/Listener）或从属者（Dependents）模式
 * 符合开闭原则
 * Java语言对观察者模式支持
 * Observer接口,充当抽象观察者
 * Oberverable类,充当观察目标类,有很多方法,参照java API
 * "Java SE Application Design With MVC":网址->:http://www.oracle.com/technetwork/articles/javase/index-142890.html
 */
public class Client {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer observer = new ConcreteObserver();
		subject.attach(observer);
		subject.notify1();
	}

}
