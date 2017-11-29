package decorator.demo2_1;

public class YangYangDecorator extends YangYang {
	protected YangYang yangyang;
	public YangYangDecorator(YangYang yangyang){
		this.yangyang = yangyang;
	}
	@Override
	public void run() {
		yangyang.run();
		
	}
	
}
