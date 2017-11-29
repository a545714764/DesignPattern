package adapter.demo1;

public class OperationAdapter  implements DrawOperation{
	private Adaptee adaptee;
	public OperationAdapter(Adaptee adaptee) {
		this.adaptee=adaptee;
	}
	@Override
	public void Draw() {
		adaptee.DrawAngle();
		
	}
	
	

}
