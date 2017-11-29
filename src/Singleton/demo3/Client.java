package Singleton.demo3;
/*
 * ����ģʽʵ��3֮��ӡ��
 * �ڲ���ϵͳ��,��ӡ��(Print Spooler)��һ�����ڹ����ӡ�����Ӧ�ó���,ͨ����ӡ���û�����ɾ����
 * ��ֹ���߸ı���������ȼ�,��һ��ϵͳ��ֻ��������һ����ӡ�ض���,����ظ�������ӡ�����׳��쳣
 * ��ʹ�õ���ģʽ��ģ��ʵ�ִ�ӡ�ص����
 */
public class Client {

	public static void main(String[] args) {
		PrintSpoolerSingleton ps1,ps2;
		try{
			ps1 = PrintSpoolerSingleton.getInstance();
			ps1.manageJobs();
		}catch(PrintSpoolerException e){
			System.out.println(e.getMessage());
		}
		System.out.println("---------------------------");
		try{
			ps2 = PrintSpoolerSingleton.getInstance();
			ps2.manageJobs();
		}catch (PrintSpoolerException e) {
			System.out.println(e.getMessage());
		}
	}

}
