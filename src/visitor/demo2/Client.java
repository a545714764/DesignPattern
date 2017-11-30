package visitor.demo2;
/*
 * ������ģʽʵ��2֮���ﳵ
 * �˿��ڳ����н�ѡ�����Ʒ,��ƻ����ͼ��ȷ��ڹ��ﳵ�У�Ȼ������Ա������ڹ�������У�
 * �˿���Ҫ����Щ��Ʒ���з��ʣ��Ա�ȷ����Щ��Ʒ��������֮������Ա����۸�ʱҲ��Ҫ���ʹ��ﳵ
 * �ڹ˿���ѡ�����Ʒ����ʱ�����ﳵ��Ϊһ��ObjectStructure(����ṹ)���ڴ洢�������͵�
 * ��Ʒ�����˿ͺ�����Ա��Ϊ������Щ��Ʒ�ķ����ߣ� ������Ҫ����Ʒ���м��ͼƼۡ���ͬ���͵���Ʒ
 * �������ʽҲ���ܲ�ͬ����ƻ����Ҫ����֮���ټƼۣ���ͼ�鲻��Ҫ��ʹ�÷�����ģʽ����Ƹù�����̡�
 */
public class Client {

	public static void main(String[] args) {
		Product b1 = new Book();
		Product b2 = new Book();
		Product a1 = new Apple();
		Visitor visitor;
		
		BuyBasket basket = new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);
		
		visitor = (Visitor) XMLUtil.getBean();
		visitor.setName("����");
		basket.accept(visitor);
		

	}

}
