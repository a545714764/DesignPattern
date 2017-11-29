package Interpreter.Demo1;
/*
 * ������ģʽ
 * ĳ�����˿��Ƴ������һЩ�򵥵�Ӣ��ָ��,���ķ���������:
 * expression::=direction action distance|composite
 * composite::=expression 'and' expression
 * direction::='up'|'down'|'left'|'right'
 * action::='move'|'run'
 * distance::=an integer
 * ������:up move 5,�����"�����ƶ�5����λ";
 * ����:down run 10 and left move 20,�����"���¿����ƶ�10����λ�������ƶ�20����λ"
 * ��ʹ�ý�����ģʽ����Ƹó���ģ��ʵ�� 
 */
public class Client {

	public static void main(String[] args) {
		String instruction = "up move 5 and down run 10 and left move 5";
		InstructionHander handler = new InstructionHander();
		handler.handle(instruction);
		String outString;
		outString = handler.output();
		System.out.println(outString);

	}

}
