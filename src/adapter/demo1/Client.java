package adapter.demo1;
/*
 * 一个软件团队开发绘图系统，设计了圆对象(Circle)、矩形对象(Rectangle)，线对象(Line)
 * 都支持Draw()函数，即可以通过Draw()函数绘制图形。为了加快项目进度，将角度对象(Angle)
 * 绘制功能交给了合作团队实现。但合作团队将角度对象绘制函数定为了DrawAngle()。绘图系统提
 * 供给用户后，用户不满意，希望能统一的调用，不用记太多命令。应用适配器模式，用JAVA控制台应
 * 用程序完善该设计。绘制该模式的UML图。
 */
public class Client {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.Draw();

		OperationAdapter operationAdapter = new OperationAdapter(new Adaptee());
		operationAdapter.Draw();

	}

}
