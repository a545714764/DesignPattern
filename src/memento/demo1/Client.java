package memento.demo1;
/*
 * 某模拟战争游戏为了给玩家提供更好的用户体验,在游戏过程中可以设置一个恢复点
 * 记录当前游戏场景,如果在后续游戏中玩家角色"不幸牺牲",可以返回到先前场景
 * 从所设恢复点开始重新游戏.现使用备忘录模式设计该功能,绘制类图并编程实现
 */
public class Client {

	public static void main(String[] args) {
		GameScene scene = new GameScene();
		Caretaker ct = new Caretaker();
		scene.setScene("无名湖");
		scene.setLifeValue(3);
		System.out.println("原始状态:");
		scene.display();
		ct.setSceneMemento(scene.save());
		System.out.println("-----------------------");
		
		scene.setScene("魔鬼洞");
		scene.setLifeValue(0);
		System.out.println("牺牲状态:");
		scene.display();
		System.out.println("-----------------------");
		
		scene.restore(ct.getSceneMemento());
		System.out.println("恢复到原始状态:");
		scene.display();
		System.out.println("-----------------------");

	}

}
