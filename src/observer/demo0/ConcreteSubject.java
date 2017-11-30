package observer.demo0;

public class ConcreteSubject extends Subject {

	@Override
	public void notify1() {
		for(Object obj:observers){
			((Observer)obj).update();
		}
	}

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
		// TODO Auto-generated method stub
		
	}

}
