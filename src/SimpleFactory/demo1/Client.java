package SimpleFactory.demo1;
/*
 * ʹ�ü򵥹���ģʽ���һ�����Դ�����ͬ������״(Shape)�Ļ�ͼ������
 * ��ɴ���Բ��(Circle),����(Rectangle)��������(Triangle)����
 * ÿ������ͼ�ξ����л���draw()�Ͳ���erase()��������
 * Ҫ���ڻ��Ʋ�֧�ֵļ���ͼ��ʱ,�׳�һ��UnsupportedShapeException�쳣
 * ������ͼ�����ʵ��
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
