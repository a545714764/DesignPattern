package Interpreter.Demo2;

public class ModNode extends SymbolNode {

	public ModNode(Node left, Node right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	
	public int interpret(){
		return super.left.interpret()%super.right.interpret();
	}

}
