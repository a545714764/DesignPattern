package strategy.demo1;

public class StudentDiscount implements Discount {
	@Override
	public double calculate(double price) {
		// TODO �Զ����ɵķ������
		return price*0.8;
	}

}
