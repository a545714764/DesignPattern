package SimpleFactory.demo1;

public class ShapeFactory {
	public static Shape createShape(String type) throws UnsupportedShapeException{
		if(type.equalsIgnoreCase("c")){
			return new Circle();
		}
		else if(type.equalsIgnoreCase("r")){
			return new Rectangle();
		}
		else if(type.equalsIgnoreCase("t")){
			return new Triangle();
		}
		else{
			throw new UnsupportedShapeException("不支持该形状!");
		}
	}
}
