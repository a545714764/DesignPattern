package FactoryMethodPattern.demo2;

import util.XMLUtil;

/*
 * 工厂方法模式
 * 通过读取XML配置来生产对象
 */
public class Client {

	public static void main(String[] args) {
		TV tv;
		TVFactory factory;
		factory = (TVFactory) XMLUtil.getBean();
		tv = factory.produceTV();
		tv.play();

	}

}
