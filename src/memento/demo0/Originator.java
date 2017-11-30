package memento.demo0;

public class Originator {
	private String state;
	public Originator() {
		// TODO Auto-generated constructor stub
	}
	public Memento createMemento(){
		return new Memento(this);
	}
	public void restoreMemento(Memento m){
		state = m.getState();
	}
	public void setState(String state){
		this.state = state;
	}
	
	public String getState(){
		return this.state;
	}
}
