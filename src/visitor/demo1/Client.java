package visitor.demo1;
/*
 * 访问者模式
 * 某高校奖励审批系统可以实现教师奖励和学生奖励的审批(AwardCheck)，如果教师发表论文
 * 数超过10篇或者学生论文超过2篇可以评选科研奖，如果教师教学反馈分大于等于90分或者学生
 * 平均成绩大于等于90分可以评选成绩优秀奖，使用访问者模式设计该系统，以判断候选人集合中
 * 的教师或学生是否符合某种获奖要求
 */
public class Client {
	public static void main(String[] args) {
		CandidateList list = new CandidateList();
		AwardCheck sac,eac;
		Teacher teacher = new Teacher();
		Student student = new Student();
		teacher.setName("风清扬");
		teacher.setPaperAmount(15);
		teacher.setFeedbackScore(92);
		
		student.setName("令狐冲");
		student.setPaperAmount(2);
		student.setScore(85);
		
		list.addPerson(teacher);
		list.addPerson(student);
		
		sac = new ScientificAwardCheck();
		list.accept(sac);
		
		eac = new ExcellenceAwardCheck();
		list.accept(eac);
	}
}
