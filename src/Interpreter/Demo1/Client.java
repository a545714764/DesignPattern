package Interpreter.Demo1;
/*
 * 解释器模式
 * 某机器人控制程序包含一些简单的英文指令,其文法规则如下:
 * expression::=direction action distance|composite
 * composite::=expression 'and' expression
 * direction::='up'|'down'|'left'|'right'
 * action::='move'|'run'
 * distance::=an integer
 * 如输入:up move 5,则输出"向上移动5个单位";
 * 输入:down run 10 and left move 20,则输出"向下快速移动10个单位再向左移动20个单位"
 * 现使用解释器模式来设计该程序并模拟实现 
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
