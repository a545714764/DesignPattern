package visitor.demo2;

public class Saler extends Visitor {

	@Override
	public void visit(Apple apple) {
		System.out.println("����Ա"+name+"��ƻ������,Ȼ�������jiage");
	}

	@Override
	public void visit(Book book) {
		System.out.println("����Ա"+name+"ֱ�Ӽ�����ļ۸�");
	}

}
