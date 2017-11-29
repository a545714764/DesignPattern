package visitor.demo1;
/*
 * ������ģʽ
 * ĳ��У��������ϵͳ����ʵ�ֽ�ʦ������ѧ������������(AwardCheck)�������ʦ��������
 * ������10ƪ����ѧ�����ĳ���2ƪ������ѡ���н��������ʦ��ѧ�����ִ��ڵ���90�ֻ���ѧ��
 * ƽ���ɼ����ڵ���90�ֿ�����ѡ�ɼ����㽱��ʹ�÷�����ģʽ��Ƹ�ϵͳ�����жϺ�ѡ�˼�����
 * �Ľ�ʦ��ѧ���Ƿ����ĳ�ֻ�Ҫ��
 */
public class Client {
	public static void main(String[] args) {
		CandidateList list = new CandidateList();
		AwardCheck sac,eac;
		Teacher teacher = new Teacher();
		Student student = new Student();
		teacher.setName("������");
		teacher.setPaperAmount(15);
		teacher.setFeedbackScore(92);
		
		student.setName("�����");
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
