package visitor.demo0;

public class ConcreteElementC implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	public void operationA(){
		//ҵ�񷽷�
	}

}
