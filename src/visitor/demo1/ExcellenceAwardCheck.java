package visitor.demo1;
//科研将审批类：具体访问者类
public class ExcellenceAwardCheck extends AwardCheck {

	@Override
	public void visit(Teacher teacher) {
		if(teacher.getFeedbackScore()>=90){
			System.out.println(teacher.getName()+"可评选教师成绩优秀奖");
		}
		
	}

	@Override
	public void visit(Student student) {
		if(student.getScore()>=90){
			System.out.println(student.getName()+"可评选学生成绩优秀奖");
		}
		
	}

}
