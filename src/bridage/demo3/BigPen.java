package bridage.demo3;

public class BigPen extends Pen {

	@Override
	public void draw(String name) {
		String penType = "���ë�ʻ���";
		this.color.bepaint(penType, name);
	}

}
