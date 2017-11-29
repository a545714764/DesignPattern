package flyweight.demo0;
/*
 * 享元模式一般形式:
 * public class FlyweightFactory{
 * 		private HashMap flyweights = new HashMap();
 * 
 * 		public Flyweight getFlyweight(String key){
 * 			if(flyweights.containsKey(key)){
 * 				return (Flyweight)flyweights.get(key);
 * 			}else{
 * 				Flyweight fw = new ConcreteFlyweight();
 * 				flyweights.put(key,fw);
 * 				return fw;
 * 			}
 * 		}
 * }
 * 
 * public class Flyweight{
 * 		private String intrinsicState;
 * 		
 * 		public Flyweight(String intrinsicState){
 * 			this.intrinsicState = intrinsicState;
 * 		}
 * 		
 * 		public void operation(String intrinsicState){
 * 			***
 * 		}
 * }
 */
public class Client {

	public static void main(String[] args) {

	}

}
