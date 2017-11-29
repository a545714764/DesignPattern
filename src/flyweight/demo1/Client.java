package flyweight.demo1;
/*
 * 享元模式
 * 使用享元模式设计一个围棋软件,在系统中只存在一个白棋对象和一个黑棋对象,但是它们可以在棋盘的不同位置显示多次
 * 要求使用简单工厂模式和单例模式实现享元工厂类的设计
 */
public class Client {

	public static void main(String[] args) {
		IgoChessman black1,black2,black3,white1,white2;
		IgoChessmanFactory factory;
		factory = IgoChessmanFactory.getInstance();
		black1 = factory.getIgoChessman("b");
		black2 = factory.getIgoChessman("b");
		black3 = factory.getIgoChessman("b");
		System.out.println("判断两颗黑棋是否相同:"+ (black1==black2));
		white1 = factory.getIgoChessman("w");
		white2 = factory.getIgoChessman("w");
		System.out.println("判断两颗白棋是否相同:"+ (white1==white2));
		black1.locate(new Coordiantes(1, 2));
		black2.locate(new Coordiantes(3, 4));
		black3.locate(new Coordiantes(1, 3));
		white1.locate(new Coordiantes(2, 5));
		white2.locate(new Coordiantes(2, 4));
	}

}
