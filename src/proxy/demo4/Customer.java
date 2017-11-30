package proxy.demo4;
/*
 * 代理模式实例4之网上商城
 * 生产商(Factory)需要销售商品(Product)，网上商城(E-Shop)提供了一个平台，可以帮助销售这些商品，获得更大的销量
 * 。当顾客(Custom)从网上商城选购商品的时候，实际是从生产商获得的商品。应用代理模式，用JAVA控制台应用程序改进该设计
 * 。绘制该模式的UML图。
 */
public class Customer {

	public static void main(String[] args) {
		E_shopProxy proxy = new E_shopProxy();
		proxy.sell();
	}

}
