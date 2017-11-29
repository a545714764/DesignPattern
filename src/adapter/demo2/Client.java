package adapter.demo2;
/*
 * ������ʵ��2֮�㷨����
 * ����һ�����DataOperation���������򷽷�sort(int [])�Ͳ��ҷ���search(int[],int)
 * ��֪��QuickSort��quickSort(int[])����ʵ���˿��������㷨�� ��BinarySearch��
 * binarySearch(int[],int)����ʵ���˶��ֲ����㷨����ʹ��������ģʽ�����һ��ϵͳ
 * �ڲ��޸�Դ���������½���QuickSort����BinarySearch�ķ������䵽DataOperation
 * �ӿ���
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
		System.out.println("��������");
		result = operation.sort(array);
		for(int i:array){
			System.out.println(i+",");
		}
		System.out.println();
		
		System.out.println("���ҹؼ���24:");
		value = operation.search(result, 24);
		if(value!=-1){
			System.out.println("�ҵ��ؼ���24");
		}else{
			System.out.println("û���ҵ��ؼ���24");
		}
		
		System.out.println("���ҹؼ���25:");
		value = operation.search(result, 25);
		if(value!=-1){
			System.out.println("�ҵ��ؼ���25");
		}else{
			System.out.println("û���ҵ��ؼ���25");
		}

	}

}
