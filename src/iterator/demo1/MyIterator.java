package iterator.demo1;

public class MyIterator implements AbstractIterator {
	private String[] productsName;
	private int index1;
	private int index2;
	public MyIterator(AbstractProductList list){
		productsName= list.getProductName();
		index1 = 0;
		index2 = productsName.length-1;
	}
	@Override
	public void next() {
		if(index1<productsName.length){
			index1++;
		}

	}

	@Override
	public boolean isLast() {
		// TODO Auto-generated method stub
		return (index1==productsName.length);
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		if(index2>-1){
			index2--;
		}
	}

	@Override
	public boolean isFirst() {
		// TODO Auto-generated method stub
		return (index2==-1);
	}

	@Override
	public String getNextItem() {
		// TODO Auto-generated method stub
		return productsName[index1];
	}

	@Override
	public String getPreviousItem() {
		// TODO Auto-generated method stub
		return productsName[index2];
	}

}
