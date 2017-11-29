package mediator.demo0;

public class ConcreteColleague extends Colleague {

	public ConcreteColleague(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method1() {
	}

	@Override
	public void method2() {
		mediator.operation();
	}

}
