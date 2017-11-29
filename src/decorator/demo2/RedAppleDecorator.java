package decorator.demo2;

public class RedAppleDecorator extends YangYangDecorator {
	public RedAppleDecorator(YangYang yangyang) {
		super(yangyang);
		yangyang.redTime = 3;
		
	}

	public void run(){
		if(yangyang.redTime>0){
			this.eatRedApple();
			System.out.println("r:"+yangyang.redTime);
		}
		super.run();
	}
	public void eatRedApple(){
		System.out.println("红苹果被吃了,加上了保护罩");
		if(Client.wolfStep==Client.yangStep){
			Client.yangStep+=1;
		}
		yangyang.redTime--;
	}
}
