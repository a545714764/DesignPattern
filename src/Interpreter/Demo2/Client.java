package Interpreter.Demo2;
/*
 * 解释器实例2之数学运算解释器
 * 现需要构造一个语言解释器,使得系统可以执行整数间的乘除和求模运算.
 * 如用户输入表达式"3 * 4 / 2 % 4",输出结果为2.使用解释器模式实现该功能
 */
public class Client {

	public static void main(String[] args) {
		String statement = "3 * 4 / 2 % 4";
		Calculator calculator = new Calculator();
		calculator.build(statement);
		int result = calculator.compute();
		System.out.println(result);
	}

}
