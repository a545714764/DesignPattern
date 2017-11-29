package strategy.demo1;
/*
 * 策略模式
 * 某电影院售票系统为不同类型的用户提供了不同打折方法(Discount)
 * 学生凭学生证可以享受8折优惠(StudentDiscount)，儿童可享受减免10元的优惠(ChildrenDiscount)
 * VIP用户除享受半价优惠外还可以进行积分(VIPDiscount)。使用策略模式设计该系统
 * 结合场景绘制相应的类图并编码实现
 */
public class Client {

	public static void main(String[] args) {
		MovieTicket mt = new MovieTicket();
		mt.setPrice(50.00);
		double currentPrice;
		
		Discount obj;
		obj = new StudentDiscount();
		mt.setDiscount(obj);
		currentPrice = mt.getPrice();
		System.out.println("折后价为："+currentPrice);
		System.out.println("-------------------------");
		obj = new VIPDiscount();
		mt.setDiscount(obj);
		currentPrice = mt.getPrice();
		System.out.println("折后价为："+currentPrice);
	}

}
