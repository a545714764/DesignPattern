package AbstractFactory.demo1;

public class KFCFactory implements FoodFactory{

	@Override
	public Cola createCola() {
		// TODO Auto-generated method stub
		return new KFCCola();
	}

	@Override
	public Hamburg createHamburg() {
		// TODO Auto-generated method stub
		return new KFCHamburg();
	}

	


}
