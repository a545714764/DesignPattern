package iterator.demo1;

public class ProductList extends AbstractProductList {
	public ProductList(String [] productsName){
		super(productsName);
	}
	@Override
	public AbstractIterator getIterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}

}
