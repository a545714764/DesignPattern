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
		// TODO �Զ����ɵķ������
		return sortObj.quickSort(array);
	}

	@Override
	public int search(int[] array, int key) {
		// TODO �Զ����ɵķ������
		return searchObj.binarySearch(array, key);
	}

}
