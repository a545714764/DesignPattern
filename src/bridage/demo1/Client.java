package bridage.demo1;
/*
 * 一个咖啡店可以提供大杯(JorumCoffee)、中杯(MediumCoffee)、小杯(SmallCoffee)的咖啡(Coffee)，为了满足不同用户的口
 * 味，在咖啡中可以添加牛奶(Milk)，或者糖(Sugar)，或者柠檬(Lemon)，提供给用户不同口味(flavor)的组合，如大杯咖啡加牛奶，中杯咖啡加糖
 * ，小杯咖啡加柠檬，小杯咖啡加糖等。应用桥接模式，用JAVA控制台应用程序实现该设计。绘制该模式的UML图。
 */
public class Client {
	public static void main(String[] args) {
		AbstractCoffee coffee1;
		coffee1 = new MediumCoffee();
		coffee1.setFlavor(new Milk());
		coffee1.drink();
		
		AbstractCoffee coffee2;
		coffee2 = new SmallCoffee();
		coffee2.setFlavor(new Sugar());
		coffee2.drink();
		
		AbstractCoffee coffee3;
		coffee3 = new JorumCoffee();
		coffee3.setFlavor(new Lemon());
		coffee3.drink();
	}
	
}
