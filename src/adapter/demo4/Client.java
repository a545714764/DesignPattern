package adapter.demo4;
/*
 * 适配器模式实例4之加密适配器
 * 某系统需要提供一个加密模块,将用户信息(如密码等机器信息)加密之后再存储在数据库中
 * 系统已经定义好了数据库操作类。为了提高开发效率,现需要重用已有的加密算法,这些算法
 * 封装在一些由第三方提供的类中,有些甚至没有源代码。使用适配器模式设计该加密模块,实现
 * 在不修改现有类的基础上重用的第三方加密方法
 */
public class Client {
	public static void main(String[] args) {
		DataOperation dao = (DataOperation) XMLUtil.getBean();
		dao.setPassword("sunnyLiu");
		String ps = dao.getPassword();
		String es = dao.doEncrypt(6, ps);
		System.out.println("明文为:"+ps);
		System.out.println("密文为:"+es);
		
	}
}
