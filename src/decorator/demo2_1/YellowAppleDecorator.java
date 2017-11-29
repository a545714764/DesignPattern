package decorator.demo2_1;

public class YellowAppleDecorator extends YangYangDecorator {
	public YellowAppleDecorator(YangYang yangyang) {
		super(yangyang);
	}

	public void run(){
		this.eatYellowApple();
		super.run();
	}
	public void eatYellowApple(){
		System.out.println("黄苹果被吃了,可以躺着水跑");
	}
}
