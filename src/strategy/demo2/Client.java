package strategy.demo2;
/*
 * 策略模式实例2之排序策略
 * 某系统提供了一个用于对数组数据进行操作的类,该类封装了对数组的常见操作,如查找数组元素、对数组元素进行排序等。
 * 现以排序操作为例，使用策略模式设计该数组操作类，使得客户端可以动态地更换排序算法，可以根据需要选择冒泡排序或
 * 选择排序或插入排序，也能够灵活地增加欣的排序算法
 */
public class Client {
	public static void main(String[] args) {
		int arr[]={1,4,5,3};
		int result[];
		ArrayHandler ah = new ArrayHandler();
		
		Sort sort;
		sort = (Sort) XMLUtil.getBean();
		
		ah.setSortObj(sort);
		result = ah.sort(arr);
	}
}
