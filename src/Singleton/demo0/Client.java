package Singleton.demo0;
/*
 * 单例模式一般形式
 * 在单例模式的实现过程中,需要注意如下三点:
 * 1.单例类的构造函数为私有
 * 2.提供一个自身的静态私有成员变量
 * 3.提供一个公有的静态工厂方法
 * 在单例模式使用过程中我们还需要注意一下两个问题:
 * 1.不要使用单例模式存取全局变量,因为这违背了单例模式的用意,最好将全局变量放到对应类的静态成员中
 * 2.不要将数据库连接做成单例,因为一个系统可能会与数据库有多个连接,并且在有连接池的情况下,应当尽
 * 可能即使释放连接.单例模式由于使用静态成员存储类的实例,所以可能会造成资源无法即使释放,带来一些问题.
 */
public class Client {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton(); 将构造方法设为私有,使用new创建对象时编译错误
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1==s2);
	}

}
