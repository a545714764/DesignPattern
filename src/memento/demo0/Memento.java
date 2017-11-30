package memento.demo0;

class Memento {
	private String state;
	public Memento(Originator o) {
		state = o.getState();
		// TODO Auto-generated constructor stub
	}
	public void setState(String state){
		this.state =state;
	}
	public String getState(){
		return this.state;
	}
}
