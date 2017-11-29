package iterator.demo1;
/*
 * 某商品管理系统的商品名称存储在一个字符串数组中
 * 先需要自定义一个双向迭代器(MyIterator)实现对该商品名称数组的双向(前向和后向)遍历
 * 绘制类图并编程实现
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pNames= {"ThinkPad 电脑","Tissot 手表","iPhone 手机","LV手提包"};
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
