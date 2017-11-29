package proxy.demo1;

import java.util.Calendar;
import java.util.GregorianCalendar;
//日志记录代理类:代理主题
public class LoggerProxy implements AbstractLog {
	private BusinessClass business;
	
	public LoggerProxy() {
		// TODO Auto-generated constructor stub
		business = new BusinessClass();
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		//日历类
		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR)+12;
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		String dateTime = year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;
		System.out.println("方法method()被调用,调用时间为"+dateTime);
		try{
			business.method();
			System.out.println("方法method()调用成功!");
		}catch(Exception e){
			System.out.println("方法method()调用失败!");
		}

	}

}
