package decorator.demo2;

public class YangYangDecorator extends YangYang {
	protected YangYang yangyang;
	public YangYangDecorator(YangYang yangyang){
		this.yangyang = Xiyangyang.getInstance();
	}
	@Override
	public void run() {
		yangyang.run();
		
	}
	
}
