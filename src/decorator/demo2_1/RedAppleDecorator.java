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
		System.out.println("��ƻ��������,�����˱�����");
	}
}
