package memento.demo1;

public class SceneMemento {
	private String scene;
	private int lifeValue;
	public SceneMemento(String scene,int lifeValue) {
		this.scene =scene;
		this.lifeValue = lifeValue;
	}
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
	
}
