package AbstractFactory.demo1;

public class Client {

	public static void main(String[] args) {
		FoodFactory factory;
		Cola cola;
		Hamburg hamburg;
		factory = new KFCFactory();
		cola = factory.createCola();
		hamburg = factory.createHamburg();
		cola.product();
		hamburg.product();

	}

}
