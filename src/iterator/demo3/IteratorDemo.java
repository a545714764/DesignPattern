package iterator.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void process(Collection c){
		Iterator i = c.iterator();
		while(i.hasNext()){
			System.out.println(i.next().toString());
		}
	}
	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add("cat1");
		list.add("cat2");
		list.add("cat3");
		list.add("cat4");
		list.add("cat5");
//		Iterator i = list.iterator();          //ɾ����һ��Ԫ��
//		i.next();
//		i.remove();
		
//		i.remove();					
//		i.next();						//ɾ����������Ԫ�ص�ʱ����ȥ��next()
//		i.remove();
		process(list);
		

	}

}
