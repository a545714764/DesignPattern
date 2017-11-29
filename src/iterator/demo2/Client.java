package iterator.demo2;
/*
 * 迭代器实例2之电视机遥控器
 * 电视机遥控器就是一个迭代器的实例,通过它可以实现对电视机频道集合的遍历操作.
 * 本实例将模拟电视机遥控器的实现
 */
public class Client {
	public static void display(Television tv){
		TVIterator i = tv.createIterator();
		System.out.println("电视机频道:");
		while(!i.isLast()){
			System.out.println(i.currentChannel().toString());
			i.next();
		}
	}
	
	public static void reverseDisplay(Television tv){
		TVIterator i = tv.createIterator();
		i.setChannel(5);
		System.out.println("逆向遍历电视机频道:");
		while(!i.isFirst()){
			i.previous();
			System.out.println(i.currentChannel().toString());
			
		}
	}

	public static void main(String[] args) {
		Television tv;
		tv = (Television) XMLUtil.getBean();
		display(tv);
		System.out.println("------------------------------");
		reverseDisplay(tv);
		

	}

}
