package facade.demo0;
/*
 * 外观模式一般形式
 * 在外观角色中可能存在如下典型代码:
 * public class Facade{
 * 		private SubSystemA obj1 = new SubSystemA();
 * 		private SubSystemB obj2 = new SubSystemB();
 * 		private SubSystemC obj3 = new SubSystemC();
 * 
 * 		public void method(){
 * 			obj1.method();
 * 			obj2.method();
 * 			obj3.method();
 * 		}
 * }
 * 
 * 外观模式扩展:
 * 1.不要通过集成一个外观类在子系统中加入新的行为,这种做法是错误的
 */
public class Client {

	public static void main(String[] args) {

	}

}
