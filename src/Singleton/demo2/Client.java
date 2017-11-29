package Singleton.demo2;
/*
 * 单例模式实例2之身份证号码
 * 在现实生活中,居民身份证号码具有唯一性,同一个人不允许有多个身份证号码,第一次申请身份证时
 * 将给居民分配一个身份证号码,如果之后因为遗失等原因补办时,还是使用原来的身份证号码,不会产
 * 生新的号码.现使用单例模式模拟该场景
 */
public class Client {

	public static void main(String[] args) {
		IdentityCardNo no1,no2;
		no1 = IdentityCardNo.getInstance();
		no2 = IdentityCardNo.getInstance();
		System.out.println("身份证号码是否一致:"+(no1==no2));
		
		String str1,str2;
		str1 = no1.getIdentityCardNo();
		str2 = no2.getIdentityCardNo();
		System.out.println("第一次号码:"+str1);
		System.out.println("第二次号码"+str2);
		System.out.println("内容是否相等:"+str1.equalsIgnoreCase(str2));
		System.out.println("是否是相同对象:"+(str1==str2));
	}

}
