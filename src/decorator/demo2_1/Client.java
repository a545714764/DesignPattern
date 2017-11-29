package decorator.demo2_1;

import java.util.Random;

/*
 * “喜羊羊逃命”游戏：喜羊羊被灰太狼追，喜羊羊最多5条命，灰太狼每咬到喜羊羊一次，喜羊羊就要少一条命。在逃的过程中喜羊羊可以吃到三种
 * 苹果，吃“红苹果”可以给喜羊羊加上保护罩，吃“绿苹果”可以加快喜羊羊奔跑速度，吃“黄苹果”可以使喜羊羊趟着水跑。应用装饰模式，用JAVA
 * 控制台应用程序实现该设计。绘制该模式的UML图。
 */
public class Client {
	public static void main(String[] args) {
		YangYang yang,yang1,yang2,yang3;
		yang = new Xiyangyang();
		yang1 = new GreenAppleDecorator(yang);
		yang2 = new RedAppleDecorator(yang1);
		yang3 = new YellowAppleDecorator(yang2);
		yang3.run();
		
		
		
	}

}
