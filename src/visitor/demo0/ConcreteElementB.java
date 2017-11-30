package visitor.demo0;

public class ConcreteElementB implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	public void operationA(){
		//业务方法
	}

}
