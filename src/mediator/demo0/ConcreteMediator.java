package mediator.demo0;

public class ConcreteMediator extends Mediator {

	@Override
	public void operation() {
		((Colleague)(colleagues.get(0))).method1();
	}

}
