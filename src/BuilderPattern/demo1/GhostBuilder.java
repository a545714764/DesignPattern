package BuilderPattern.demo1;

public class GhostBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("ħ��");

	}

	@Override
	public void buildSex() {
		actor.setSex("��");

	}

	@Override
	public void buildFace() {
		actor.setFace("��ª");

	}

	@Override
	public void buildCostume() {
		actor.setCostume("����");

	}

	@Override
	public void buildHairsytle() {
		actor.setHairsytle("��ͷ");

	}

}
