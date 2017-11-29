package Interpreter.Demo2;

public abstract class SymbolNode implements Node {
	protected Node left;
	protected Node right;
	
	public SymbolNode(Node left,Node right) {
		// TODO Auto-generated constructor stub
		this.left = left;
		this.right = right;
	}
	@Override
	public int interpret() {

		return 0;
	}

}
