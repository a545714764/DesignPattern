package decorator.demo2;
public class Xiyangyang extends YangYang {
	
	private static Xiyangyang instance = null;
	public static Xiyangyang getInstance(){
		if(instance == null){
			instance = new Xiyangyang();
		}
		return instance;
	}
	
	@Override
	public void run() {
		System.out.println("Ï²ÑóÑóÔÚ±¼ÅÜ");

		Client.yangStep++;
	}

}
