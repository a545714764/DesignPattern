package Singleton.demo3;

public class PrintSpoolerSingleton {
	private static PrintSpoolerSingleton instance = null;
	
	private PrintSpoolerSingleton(){
		
	}
	
	public static PrintSpoolerSingleton getInstance() throws PrintSpoolerException{
		if(instance == null){
			System.out.println("������ӡ��!");
			instance =new PrintSpoolerSingleton();
		}else{
			throw new PrintSpoolerException("��ӡ�����ڹ�����!");
		}
		return instance;
	}
	
	public void manageJobs(){
		System.out.println("�����ӡ����");
	}
}
