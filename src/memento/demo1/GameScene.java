package memento.demo1;

public class GameScene {
	private String scene;
	private int lifeValue;
	public String getScene() {
		return scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}
	public int getLifeValue() {
		return lifeValue;
	}
	public void setLifeValue(int lifeValue) {
		this.lifeValue = lifeValue;
	}
	public void restore(SceneMemento m){
		this.scene = m.getScene();
		this.lifeValue = m.getLifeValue();
	}
	public SceneMemento save(){
		return new SceneMemento(this.scene,this.lifeValue);
	}
	public void display(){
		System.out.println("当前游戏场景为:"+this.scene+",");
		System.out.println("您还有"+this.lifeValue+"条命!");
	}
	
}
