package visitor.demo2;
/*
 * 访问者模式实例2之购物车
 * 顾客在超市中将选择的商品,如苹果、图书等放在购物车中，然后到收银员处付款。在购物过程中，
 * 顾客需要对这些商品进行访问，以便确认这些商品的质量，之后收银员计算价格时也需要访问购物车
 * 内顾客所选择的商品。此时，购物车作为一个ObjectStructure(对象结构)用于存储各种类型的
 * 商品，而顾客和收银员作为访问这些商品的访问者， 他们需要对商品进行检查和计价。不同类型的商品
 * 其访问形式也可能不同，如苹果需要过秤之后再计价，而图书不需要。使用访问者模式来设计该购物过程。
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
		visitor.setName("张三");
		basket.accept(visitor);
		

	}

}
