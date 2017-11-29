package iterator.demo1;
/*
 * ĳ��Ʒ����ϵͳ����Ʒ���ƴ洢��һ���ַ���������
 * ����Ҫ�Զ���һ��˫�������(MyIterator)ʵ�ֶԸ���Ʒ���������˫��(ǰ��ͺ���)����
 * ������ͼ�����ʵ��
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pNames= {"ThinkPad ����","Tissot �ֱ�","iPhone �ֻ�","LV�����"};
		AbstractIterator iterator;
		AbstractProductList list;
		list = new ProductList(pNames);
		iterator = list.getIterator();
		while(!iterator.isLast()){
			System.out.println(iterator.getNextItem());
			iterator.next();
		}
		System.out.println("-------------------");
		while( !iterator.isFirst()){
			System.out.println(iterator.getPreviousItem());
			iterator.previous();
		}

	}

}
