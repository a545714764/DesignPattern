package strategy.demo1;

public class StudentDiscount implements Discount {
	@Override
	public double calculate(double price) {
		// TODO 自动生成的方法存根
		return price*0.8;
	}

}
