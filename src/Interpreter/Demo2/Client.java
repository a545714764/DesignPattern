package Interpreter.Demo2;
/*
 * ������ʵ��2֮��ѧ���������
 * ����Ҫ����һ�����Խ�����,ʹ��ϵͳ����ִ��������ĳ˳�����ģ����.
 * ���û�������ʽ"3 * 4 / 2 % 4",������Ϊ2.ʹ�ý�����ģʽʵ�ָù���
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
