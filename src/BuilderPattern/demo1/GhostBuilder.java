package BuilderPattern.demo1;

public class GhostBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("Ä§¹í");

	}

	@Override
	public void buildSex() {
		actor.setSex("Ñý");

	}

	@Override
	public void buildFace() {
		actor.setFace("³óÂª");

	}

	@Override
	public void buildCostume() {
		actor.setCostume("ºÚÒÂ");

	}

	@Override
	public void buildHairsytle() {
		actor.setHairsytle("¹âÍ·");

	}

}
