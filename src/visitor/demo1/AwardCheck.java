package visitor.demo1;
//抽象奖励审批类：抽象访问者类
public abstract class AwardCheck {
	public abstract void visit(Teacher teacher);
	public abstract void visit(Student student);
}
