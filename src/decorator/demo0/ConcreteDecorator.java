package decorator.demo0;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void operation(){
		super.operation();
		addedBehavior();
	}
	public void addedBehavior(){
		
	}
	
}
