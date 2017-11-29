package AbstractFactory.demo1;

public class McDonaldsFactory implements FoodFactory{

	@Override
	public Cola createCola() {
		// TODO Auto-generated method stub
		return new McDonaldsCola();
	}

	@Override
	public Hamburg createHamburg() {
		// TODO Auto-generated method stub
		return new McDonaldsHamburg();
	}
	
	

}
