package decorator.demo3;
/*
 * 半透明装饰模式实例3之变形金刚
 * 
 * 变形金刚在变形之前是一辆汽车,它可以在陆地上移动.当它变成机器人之后除了能够在陆地上移动
 * 之外,还可以说话;如果需要,它还可以变成飞机,除了在陆地上移动还可以在天空中飞翔.
 */
public class Client {

	public static void main(String[] args) {
		Transform camaro;
		camaro = new Car();
		camaro.move();
		System.out.println("-------------------------");
		Robot bumblebee = new Robot(camaro);
		bumblebee.move();
		bumblebee.say();
	}

}
