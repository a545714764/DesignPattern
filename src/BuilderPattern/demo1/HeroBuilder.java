package BuilderPattern.demo1;

public class HeroBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("Ó¢ÐÛ");

	}

	@Override
	public void buildSex() {
		actor.setSex("ÄÐ");

	}

	@Override
	public void buildFace() {
		actor.setFace("Ó¢¿¡");

	}

	@Override
	public void buildCostume() {
		actor.setCostume("¿ø¼×");

	}

	@Override
	public void buildHairsytle() {
		actor.setHairsytle("Æ®ÒÝ");

	}

}
