package proxy.demo4;

public class E_shopProxy implements Sell{
	private Factory factory = new Factory();

	@Override
	public void sell() {
		factory.sell();	
	}

}
