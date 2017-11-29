package Interpreter.Demo1;
//And解释:非终结符表达式
public class AndNode extends AbstractNode {
	private AbstractNode left;
	private AbstractNode right;
	public AndNode(AbstractNode left,AbstractNode right) {
		// TODO Auto-generated constructor stub
		this.left = left;
		this.right = right;
		
	}
	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		return left.interpret()+"再"+right.interpret();
	}

}
