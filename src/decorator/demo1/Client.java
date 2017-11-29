package decorator.demo1;
/*
 * 某软件公司基于面向对象技术开发了一套图形界面显示构建库VisualComponent
 * 在使用该库构建某图形界面时，用户要求为界面定制一些特效显示效果，如带滚动条的窗体或
 * 透明窗体等。现使用装饰模式设计该构建库，绘制类图并编程模拟实现。
 */
public class Client {

	public static void main(String[] args) {
		Window windowS,windowSB,windowT;
		windowS = new SimpleWindow();
		windowSB = new ScrollbarDecorator(windowS);
		windowT = new TransparentDecorator(windowSB);
		windowT.display();

	}

}
