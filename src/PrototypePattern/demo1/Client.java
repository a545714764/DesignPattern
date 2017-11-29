package PrototypePattern.demo1;
/*
 *在某OA系统中,用户可以创建工作周报,由于某些岗位每周工作存在重复性,因此可以通过
 *复制原有工作周报并进行局部修改来快速新建工作周报
 *现使用原型模式来实现该功能,绘制类图并编程实现
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		WeeklyLog log_previous = new WeeklyLog();
		log_previous.setName("张三");
		log_previous.setDate("2010年第12周");
		log_previous.setContent("这周工作很忙,每天加班!");
		
		System.out.println("****周报****");
		System.out.println(log_previous.getDate());
		System.out.println(log_previous.getName());
		System.out.println(log_previous.getContent());
		System.out.println("--------------------------");
		
		WeeklyLog log_now;
		log_now = (WeeklyLog) log_previous.clone();
		log_now.setDate("2010年第13周");
		System.out.println("****周报****");
		System.out.println(log_now.getDate());
		System.out.println(log_now.getName());
		System.out.println(log_now.getContent());
	}

}
