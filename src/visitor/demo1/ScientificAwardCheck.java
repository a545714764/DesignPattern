package visitor.demo1;
//���н������ࣺ�����������
public class ScientificAwardCheck extends AwardCheck {

	@Override
	public void visit(Teacher teacher) {
		if(teacher.getPaperAmount()>=10){
			System.out.println(teacher.getName()+"����ѡ��ʦ���н�");
		}
		
	}

	@Override
	public void visit(Student student) {
		if(student.getPaperAmount()>=2){
			System.out.println(student.getName()+"����ѡѧ�����н�");
		}
		
	}

}
