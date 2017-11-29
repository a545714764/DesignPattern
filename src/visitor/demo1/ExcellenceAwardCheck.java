package visitor.demo1;
//���н������ࣺ�����������
public class ExcellenceAwardCheck extends AwardCheck {

	@Override
	public void visit(Teacher teacher) {
		if(teacher.getFeedbackScore()>=90){
			System.out.println(teacher.getName()+"����ѡ��ʦ�ɼ����㽱");
		}
		
	}

	@Override
	public void visit(Student student) {
		if(student.getScore()>=90){
			System.out.println(student.getName()+"����ѡѧ���ɼ����㽱");
		}
		
	}

}
