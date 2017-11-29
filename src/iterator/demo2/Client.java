package iterator.demo2;
/*
 * ������ʵ��2֮���ӻ�ң����
 * ���ӻ�ң��������һ����������ʵ��,ͨ��������ʵ�ֶԵ��ӻ�Ƶ�����ϵı�������.
 * ��ʵ����ģ����ӻ�ң������ʵ��
 */
public class Client {
	public static void display(Television tv){
		TVIterator i = tv.createIterator();
		System.out.println("���ӻ�Ƶ��:");
		while(!i.isLast()){
			System.out.println(i.currentChannel().toString());
			i.next();
		}
	}
	
	public static void reverseDisplay(Television tv){
		TVIterator i = tv.createIterator();
		i.setChannel(5);
		System.out.println("����������ӻ�Ƶ��:");
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
