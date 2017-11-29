package observer.demo1;
/*
 * 某在线股票软件需要提供如下功能:当股票购买者所购买的某支股票价格变化幅度达到5%时
 * 系统将自动发送通知(包括新价格)给购买该股票的股民
 * 现使用观察者模式设计该系统,绘制类图并编程实现
 */
public class Client {

	public static void main(String[] args) {
		Investor investor1,investor2;
		investor1 = new ConcreteInvestor("杨过");
		investor2 = new ConcreteInvestor("小龙女");
		
		Stock haier =new Stock("青海海尔", 20.00);
		haier.attach(investor1);
		haier.attach(investor2);
		
		haier.setPrice(25.00);

	}

}
