package strategy.demo1;

public class ChildrenDiscount implements Discount {
	@Override
	public double calculate(double price) {
		// TODO �Զ����ɵķ������
		return price-10;
	}

}
