package decorator.demo2_1;

public class RedAppleDecorator extends YangYangDecorator {
	public RedAppleDecorator(YangYang yangyang) {
		super(yangyang);
	}

	public void run(){
		this.eatRedApple();
		super.run();
	}
	public void eatRedApple(){
		System.out.println("红苹果被吃了,加上了保护罩");
	}
}
