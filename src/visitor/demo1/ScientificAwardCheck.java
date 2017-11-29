package visitor.demo1;
//科研将审批类：具体访问者类
public class ScientificAwardCheck extends AwardCheck {

	@Override
	public void visit(Teacher teacher) {
		if(teacher.getPaperAmount()>=10){
			System.out.println(teacher.getName()+"可评选教师科研奖");
		}
		
	}

	@Override
	public void visit(Student student) {
		if(student.getPaperAmount()>=2){
			System.out.println(student.getName()+"可评选学生科研奖");
		}
		
	}

}
