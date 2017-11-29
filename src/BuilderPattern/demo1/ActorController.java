package BuilderPattern.demo1;

public class ActorController {
	public Actor construct(ActorBuilder ab){
		Actor actor;
		ab.buildType();
		ab.buildCostume();
		ab.buildFace();
		ab.buildSex();
		ab.buildHairsytle();
		actor = ab.createActor();
		return actor;
	}

}
