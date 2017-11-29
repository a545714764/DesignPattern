package Singleton.demo4;
//¿¡∫∫ Ωµ•¿˝¿‡
public class LazySingleton {
	private static LazySingleton instance = null;
	private LazySingleton(){}
	synchronized public static LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}
