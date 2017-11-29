package Singleton.demo3;
/*
 * 单例模式实例3之打印池
 * 在操作系统中,打印池(Print Spooler)是一个用于管理打印任务的应用程序,通过打印池用户可以删除、
 * 中止或者改变任务的优先级,在一个系统中只允许运行一个打印池对象,如果重复创建打印池则抛出异常
 * 现使用单例模式来模拟实现打印池的设计
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
