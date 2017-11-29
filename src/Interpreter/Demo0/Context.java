package Interpreter.Demo0;

import java.util.HashMap;

public class Context {
	private HashMap map = new HashMap();
	public void assign(String key,String value){
		//往环境类中设值
	}
	public String lookup(String key){
		return key;
		//获取存储在环境类中的值
	}
}
