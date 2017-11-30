package proxy.demo4;

import java.util.ArrayList;
import java.util.List;

public class Factory implements Sell {
	protected List<Product> productList = new ArrayList();
	@Override
	public void sell() {
		System.out.println("factory出售商品");

	}

}
