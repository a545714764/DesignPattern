package strategy.demo1;

public class VIPDiscount implements Discount {
	@Override
	public double calculate(double price) {
		System.out.println("���ӻ���!");
		return price*0.5;
	}

}
