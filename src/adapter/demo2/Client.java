package adapter.demo2;
/*
 * 适配器实例2之算法适配
 * 现有一个借口DataOperation定义了排序方法sort(int [])和查找方法search(int[],int)
 * 已知类QuickSort的quickSort(int[])方法实现了快速排序算法， 类BinarySearch的
 * binarySearch(int[],int)方法实现了二分查找算法。现使用适配器模式来设计一个系统
 * 在不修改源代码的情况下将类QuickSort和类BinarySearch的方法适配到DataOperation
 * 接口中
 */
public class Client {

	public static void main(String[] args) {
		DataOperation operation;
		QuickSort sortObj = new QuickSort();
		BinarySearch searchObj = new BinarySearch();
		operation = new OperationAdapter(sortObj, searchObj);
		int array[] = {13,24,15,36,26,17,68,34};
		int result[];
		int value;
		System.out.println("排序结果：");
		result = operation.sort(array);
		for(int i:array){
			System.out.println(i+",");
		}
		System.out.println();
		
		System.out.println("查找关键字24:");
		value = operation.search(result, 24);
		if(value!=-1){
			System.out.println("找到关键字24");
		}else{
			System.out.println("没有找到关键字24");
		}
		
		System.out.println("查找关键字25:");
		value = operation.search(result, 25);
		if(value!=-1){
			System.out.println("找到关键字25");
		}else{
			System.out.println("没有找到关键字25");
		}

	}

}
