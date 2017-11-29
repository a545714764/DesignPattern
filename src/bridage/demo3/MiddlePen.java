package bridage.demo3;

public class MiddlePen extends Pen {

	@Override
	public void draw(String name) {
		String penType = "ÖĞºÅÃ«±Ê»æÖÆ";
		this.color.bepaint(penType, name);
	}

}
