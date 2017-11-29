package decorator.demo4;
/*
 * 透明装饰模式实例4之多重加密系统
 * 某系统提供了一个数据加密功能,可以对字符串进行加密。最简单的加密算法通过对字母进行移位来实现
 * 同时还提供了稍复杂的逆向输出加密,还提供了更为高级的求模加密。用户先使用最简单的加密算法对字
 * 符串进行加密,如果觉得还不够可以对加密之后的结果使用其他加密算法进行二次加密,当然也可以进行
 * 第三次加密。现使用装饰模式设计该多重加密系统
 */
public class Client {

	public static void main(String[] args) {
		String password = "sunnyLiu";
		String cpassword;
		Cipher sc,cc;
		sc = new SimpleCiper();
		cpassword = sc.encrypt(password);
		System.out.println(cpassword);
		System.out.println("----------------------");
		
		cc = new ComplexCipher(sc);
		cpassword = cc.encrypt(password);
		System.out.println(cpassword);
		System.out.println("--------------------");

	}

}
