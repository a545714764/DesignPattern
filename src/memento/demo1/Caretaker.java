package memento.demo1;
//������
public class Caretaker {
	private SceneMemento memento;

	public SceneMemento getSceneMemento() {
		return memento;
	}

	public void setSceneMemento(SceneMemento memento) {
		this.memento = memento;
	}
	
}
