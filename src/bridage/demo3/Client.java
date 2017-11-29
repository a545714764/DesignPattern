package bridage.demo3;
/*
 * 桥接模式实例3之模拟毛笔
 * 现需要提供大中小3中型号的画笔,能够绘制5中不同颜色,如果使用蜡笔,我们需要准备3*5支蜡笔
 * 也就是说必须准备15个具体的蜡笔类。而如果使用毛笔的话,只需要3种型号的毛笔,外加5个颜料盒
 * 用3+5=8个类就可以实现15只蜡笔的功能。本实例使用桥接模式来模拟毛笔的使用过程
 */
public class Client {

	public static void main(String[] args) {
		Color color;
		Pen pen;
		
		color = (Color) XMLUtil.getBean("color");
		pen = (Pen) XMLUtil.getBean("pen");
		
		pen.setColor(color);
		pen.draw("鲜花");
		
		
		

	}

}
