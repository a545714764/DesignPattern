package strategy.demo0;
/*
 * 策略模式一般形式
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
