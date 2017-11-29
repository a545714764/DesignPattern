package adapter.demo3;
/*
 * 适配器实例3之仿生机器人
 * 现需要设计一个可以模拟各种动物行为的机器人,在机器人中定义了一系列方法,如机器人叫喊方法cry()、
 * 机器人移动方法move()等。如果希望在不修改已有代码的基础上使得机器人能够像狗一样叫,像狗一样跑,
 * 可以使用适配器模式来进行系统设计
 */
public class Client {

	public static void main(String[] args) {
		Robot robot = (Robot) XMLUtil.getBean();
		robot.cry();
		robot.move();
	}

}
