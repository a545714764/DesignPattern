package SimpleFactory.demo1;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("绘制三角形");

	}

	@Override
	public void erase() {
		System.out.println("删除三角形");

	}

}
