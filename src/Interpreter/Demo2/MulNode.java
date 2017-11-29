package Interpreter.Demo2;

public class MulNode extends SymbolNode {
	
	public MulNode(Node left, Node right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	
	public int interpret(){
		return super.left.interpret()*super.right.interpret();
	}

}
