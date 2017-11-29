package mediator.demo0;

public abstract class Colleague {
	protected Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
	
	public abstract void method1();
	public abstract void method2();

}
