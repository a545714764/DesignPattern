package visitor.demo0;

public abstract class Visitor {
	public abstract void visit(ConcreteElementA elementA);
	public abstract void visit(ConcreteElementB elementB);
	public void visit(ConcreteElementC elementC){
		//ÔªËØConcreteElementC²Ù×÷´úÂë
	}
}
