package observer.demo2;

public class Cat extends MySubject {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("УЈНа");
		System.out.println("------------------------");
		
		for(Object obs:observers){
			((MyObserver)obs).response();
		}

	}

}
