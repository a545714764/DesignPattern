package iterator.demo0;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

/*
 * 迭代器一般形式
 */
public class Client {
	public static void process(MyCollection collection){
		MyIterator i = collection.createIterator();
		while(!i.isLast()){
			System.out.println(i.currentItem().toString());
			i.next();
		}
	}

	public static void main(String[] args) {
		MyCollection collection = new NewCollection();
		process(collection);

	}

}
