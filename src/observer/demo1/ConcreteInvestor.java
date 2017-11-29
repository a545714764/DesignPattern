package observer.demo1;

public class ConcreteInvestor implements Investor {
	private String name;
	
	public ConcreteInvestor(String name) {
		this.name = name;
	}
	
	@Override
	public void response(Stock stock) {

		System.out.println("��ʾ����:"+ name);
		System.out.println("-------��Ʊ:"+stock.getStockName());
		System.out.println("�۸񲨶����ȳ���5%-------");
		System.out.println("�¼۸���:"+stock.getPrice()+".");
	}

}
