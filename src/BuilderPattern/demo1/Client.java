package BuilderPattern.demo1;
/*
 * 某游戏软件中任务角色包括多种类型,不同类型的任务角色,其性别、脸型、服装、发型等
 * 外部特性有所差异,使用建造者模式创建任务角色对象,要求绘制类图并编程实现
 */
public class Client {

	public static void main(String[] args) {
		ActorController ac = new ActorController();
		ActorBuilder ab;
		ab = new AngelBuilder();
		Actor angel;
		angel = ac.construct(ab);
		String type = angel.getType();
		System.out.println(type+"的外观:");
		System.out.println("性别:"+angel.getSex());
		System.out.println("面容:"+angel.getFace());
		System.out.println("服装:"+angel.getCostume());
		System.out.println("发型:"+angel.getHairsytle());
		
	}

}
