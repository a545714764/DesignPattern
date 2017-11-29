package adapter.demo0;
/*
 * 适配器一般形式分为类适配器和对象适配器
 * 
 * 类适配器:
 * public class Adapter extends Adaptee implements Target{
 * 		public void request(){
 * 			specificRequest();
 * 		}
 * }
 * 
 * 对象适配器:
 * public class Adapter extends target{
 * 		private Adaptee adaptee;
 * 		public Adapter(Adaptee adaptee){
 * 			this.adaptee = adaptee;
 * 		}
 * 		public void request(){
 * 			adaptee.specificRequest();
 * 		}
 * }
 */
public class Client {

	public static void main(String[] args) {

	}

}

