package decorator.demo2_1;

public class GreenAppleDecorator extends YangYangDecorator {
	
	public GreenAppleDecorator(YangYang yangyang) {
		super(yangyang);
		
	}
	public void run(){
		this.eatGreenApple();
		super.run();
	}
	public void eatGreenApple(){
		System.out.println("��ƻ��������,�ӿ��˱����ٶ�");
	}
}
