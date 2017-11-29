package decorator.demo2;

import java.util.Random;

/*
 * “喜羊羊逃命”游戏：喜羊羊被灰太狼追，喜羊羊最多5条命，灰太狼每咬到喜羊羊一次，喜羊羊就要少一条命。在逃的过程中喜羊羊可以吃到三种
 * 苹果，吃“红苹果”可以给喜羊羊加上保护罩，吃“绿苹果”可以加快喜羊羊奔跑速度，吃“黄苹果”可以使喜羊羊趟着水跑。应用装饰模式，用JAVA
 * 控制台应用程序实现该设计。绘制该模式的UML图。
 */
/*
 * 游戏设计：每回合有一次随机事件：
 * 1.可以吃到三种苹果中的一种
 * 2.遇到水地带
 * 3.灰太狼和喜洋洋拥有相同速度，每回合step++；
 * 4.灰太狼在原点step=0。喜洋洋在远点step=5
 * 5.喜洋洋有五次生命
 * 6.当灰太狼wolfStep == 喜洋洋 yangStep 生命值-1
 */
public class Client {
	static YangYang yang = Xiyangyang.getInstance();
	private int huihe = 1;
	public static int wolfStep = 0;
	public static int yangStep = 5;
	public static int shui = 1;
	public static void main(String[] args) {
		Random random = new Random();
		while(true){
			int result = random.nextInt(4)+1;
			shui = random.nextInt(2)+1;
			System.out.println("result:"+result);
			System.out.println("shui"+shui);
			game(yang,shui,result);
			System.out.println("喜洋洋跑了"+yangStep+"步");
			System.out.println("灰太狼跑了"+wolfStep+"步");
			System.out.println("喜洋洋与灰太狼的距离为："+(yangStep-wolfStep));
			if(wolfStep==yangStep){
				break;
			}
		}
	}
	public static void game(YangYang yangyang,int shui,int result){
		if(shui==1){
			switch(result){
			case 1:
				yang = new RedAppleDecorator(yangyang);
				System.out.println("吃了红苹果片");
				yangyang.redTime = 3;
				wolfStep++;
				yang.run();
				break;
			case 3:
				yang = new GreenAppleDecorator(yangyang);
				System.out.println("吃了lv苹果片");
				yangyang.greenTime = 3;
				wolfStep++;
				yang.run();
				break;
			default:
				break;
			
			}
		}else{
			if(result==2){
				yang = new YellowAppleDecorator(yangyang);
				System.out.println("吃了y苹果片");
				yangyang.yellowTime = 3;
				yang.run();
				wolfStep++;
			}else{
				if(yangyang.yellowTime>0){
					System.out.println("虽然有水,但喜洋洋吃了黄苹果,能越过水");
					yangStep++;
				}
				System.out.println("前面有水喜洋洋跑不了了，step不变");
				wolfStep++;
			}
			
		}
		
	}

}
