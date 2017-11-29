package decorator.demo2;

public class YellowAppleDecorator extends YangYangDecorator {
	public YellowAppleDecorator(YangYang yangyang) {
		super(yangyang);
		
		
	}

	public void run(){
		if(yangyang.yellowTime>0){
			this.eatYellowApple();
			System.out.println("y:"+yangyang.yellowTime);
		}
		super.run();
	}
	public void eatYellowApple(){
		System.out.println("黄苹果被吃了,可以躺着水跑");
		
		yangyang.yellowTime--;
	}
}
