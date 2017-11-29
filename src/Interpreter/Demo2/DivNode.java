package Interpreter.Demo2;

public class DivNode extends SymbolNode {

	public DivNode(Node left, Node right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	
	public int interpret(){
		return super.left.interpret()/super.right.interpret();
	}

}
