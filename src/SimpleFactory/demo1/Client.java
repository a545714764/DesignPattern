package SimpleFactory.demo1;
/*
 * 使用简单工厂模式设计一个可以创建不同几何形状(Shape)的绘图工具类
 * 如可创建圆形(Circle),矩形(Rectangle)和三角形(Triangle)对象
 * 每个几何图形均具有绘制draw()和擦除erase()两个方法
 * 要求在绘制不支持的几何图形时,抛出一个UnsupportedShapeException异常
 * 绘制类图并编程实现
 */
public class Client {

	public static void main(String[] args) {
		try{
			Shape shape;
			shape = ShapeFactory.createShape("r");
			shape.draw();
			shape.erase();
		}catch(UnsupportedShapeException e){
			System.out.println(e.getMessage());
		}

	}

}
