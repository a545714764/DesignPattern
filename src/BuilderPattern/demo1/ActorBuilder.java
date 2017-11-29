package BuilderPattern.demo1;

public abstract class ActorBuilder {
	protected Actor actor = new Actor();
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairsytle();
	public Actor createActor(){
		return actor;
	}
}
