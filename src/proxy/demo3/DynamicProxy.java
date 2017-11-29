package proxy.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	private Object obj;
	
	public DynamicProxy() {
		// TODO Auto-generated constructor stub
	}
	
	public DynamicProxy(Object obj){
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		preRequest();
		method.invoke(obj, args);
		postRequest();
		return null;
	}

	private void postRequest() {
		System.out.println("调用之后");
	}

	private void preRequest() {
		System.out.println("调用之前");
	}
	

}
