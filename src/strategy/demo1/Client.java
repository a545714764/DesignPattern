package strategy.demo1;
/*
 * ����ģʽ
 * ĳ��ӰԺ��ƱϵͳΪ��ͬ���͵��û��ṩ�˲�ͬ���۷���(Discount)
 * ѧ��ƾѧ��֤��������8���Ż�(StudentDiscount)����ͯ�����ܼ���10Ԫ���Ż�(ChildrenDiscount)
 * VIP�û������ܰ���Ż��⻹���Խ��л���(VIPDiscount)��ʹ�ò���ģʽ��Ƹ�ϵͳ
 * ��ϳ���������Ӧ����ͼ������ʵ��
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
		System.out.println("�ۺ��Ϊ��"+currentPrice);
		System.out.println("-------------------------");
		obj = new VIPDiscount();
		mt.setDiscount(obj);
		currentPrice = mt.getPrice();
		System.out.println("�ۺ��Ϊ��"+currentPrice);
	}

}
