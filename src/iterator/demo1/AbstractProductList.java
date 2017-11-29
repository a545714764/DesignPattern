package iterator.demo1;

public abstract class AbstractProductList {
	private String[] productsName;
	public AbstractProductList(String[] productsName){
		this.productsName = productsName;
	}
	public String[] getProductName(){
		
		return this.productsName;
	}
	public abstract AbstractIterator getIterator();
}
