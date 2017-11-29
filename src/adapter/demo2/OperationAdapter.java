package adapter.demo2;

public class OperationAdapter implements DataOperation {
	private QuickSort sortObj;
	private BinarySearch searchObj;
	
	public OperationAdapter(QuickSort sortObj, BinarySearch searchObj) {
		super();
		this.sortObj = sortObj;
		this.searchObj = searchObj;
	}

	@Override
	public int[] sort(int[] array) {
		// TODO 自动生成的方法存根
		return sortObj.quickSort(array);
	}

	@Override
	public int search(int[] array, int key) {
		// TODO 自动生成的方法存根
		return searchObj.binarySearch(array, key);
	}

}
