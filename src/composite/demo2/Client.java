package composite.demo2;
/*
 * 组合模式实例2之水果盘
 * 在水果盘(Plate)中有一些水果,如苹果(Apple)、香蕉(Banana)、梨子(Pear),当然大水果盘中
 * 还可以有小水果盘,现需要对盘中的水果进行遍历(吃),当然如果对一个水果盘执行"吃"方法,实际上就是
 * 吃其中的水果。使用组合模式模拟该场景.
 */
public class Client {

	public static void main(String[] args) {
		MyElement obj1,obj2,obj3,obj4,obj5;
		Plate plate1,plate2,plate3;
		
		obj1 = new Apple();
		obj2 = new Pear();
		plate1 = new Plate();
		plate1.add(obj1);
		plate1.add(obj2);
		
		obj3 = new Banana();
		obj4 = new Banana();
		plate2 = new Plate();
		plate2.add(obj3);
		plate2.add(obj4);
		
		obj5 = new Apple();
		plate3 = new Plate();
		plate3.add(plate1);
		plate3.add(plate2);
		plate3.add(obj5);
		
		plate3.eat();
		
	}

}
