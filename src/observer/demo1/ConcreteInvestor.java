package observer.demo1;

public class ConcreteInvestor implements Investor {
	private String name;
	
	public ConcreteInvestor(String name) {
		this.name = name;
	}
	
	@Override
	public void response(Stock stock) {

		System.out.println("提示股民:"+ name);
		System.out.println("-------股票:"+stock.getStockName());
		System.out.println("价格波动幅度超过5%-------");
		System.out.println("新价格是:"+stock.getPrice()+".");
	}

}
