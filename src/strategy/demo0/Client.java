package strategy.demo0;
/*
 * ����ģʽһ����ʽ
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		AbstractStrategy strategy;
		strategy = new ConcreteStrategyA();
		context.setStrategy(strategy);
		context.algorithm();
	}
}
