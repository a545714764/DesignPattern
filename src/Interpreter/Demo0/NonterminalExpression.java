package Interpreter.Demo0;

public class NonterminalExpression extends AbstractExpression {
	private AbstractExpression left;
	private AbstractExpression right;
	public NonterminalExpression(AbstractExpression left,AbstractExpression right) {
		this.left = left;
		this.right = right;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void interpret(Context contextt) {
		//�ݹ����ÿһ����ɲ��ֵ�interpret()����
		//�ڵݹ����ʱָ����ɲ��ֵ����ӷ�ʽ,�����ս���Ĺ���
	}

}
