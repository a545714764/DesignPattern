package decorator.demo2;

public class GreenAppleDecorator extends YangYangDecorator {
	public GreenAppleDecorator(YangYang yangyang) {
		super(yangyang);
		yangyang.greenTime = 3;
		
	}

	public void run(){
		if(yangyang.greenTime>0){
			this.eatGreenApple();
			
		}
		super.run();
	}
	public void eatGreenApple(){
		System.out.println("��ƻ��������,�ӿ��˱����ٶ�");
		Client.yangStep++;
		yangyang.greenTime--;
	}
}
