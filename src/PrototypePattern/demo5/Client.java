package PrototypePattern.demo5;
/*
 * ԭ��ģʽ:���ƶ���ĸ���
 * �ܶ������,�������õ��Ķ�����ԭ�Ͷ��󲢲�����ȫ��ͬ��,���ǵ�ĳЩ����ֵ������ͬ
 * ͨ��ԭ��ģʽ�����ͬ���������ٴζ������Խ����޸�,�Ӷ���ȡ�������
 * ����ѧ���������Ϣ�����������Ա�����������,��רҵ��ѧԺ��ѧУ����Ϣ����ͬ
 * Ϊ�˼򻯴�������,����ͨ��ԭ��ģʽ��ʵ�����ƶ���ĸ���
 */
public class Client {

	public static void main(String[] args) {
		Student s1,s2,s3;
		
		s1 = new Student("���޼�", "��", 24, "�������", "���ѧԺ", "���ϴ�ѧ");
		
		s2 = s1.clone();
		s2.setStuName("���");
		
		s3 = s1.clone();
		s3.setStuName("С��Ů");
		s3.setStuSex("Ů");
		
		System.out.print("����:" + s1.getStuName());
		System.out.print(",�Ա�:" + s1.getStuSex());
		System.out.print(",����:" + s1.getStuAge());
		System.out.print(",רҵ:" + s1.getStuMajor());
		System.out.print(",ѧԺ:"+ s1.getStuCollege());
		System.out.println(",ѧУ:"+s1.getStuUniversity());
		
		System.out.print("����:" + s2.getStuName());
		System.out.print(",�Ա�:" + s2.getStuSex());
		System.out.print(",����:" + s2.getStuAge());
		System.out.print(",רҵ:" + s2.getStuMajor());
		System.out.print(",ѧԺ:"+ s2.getStuCollege());
		System.out.println(",ѧУ:"+s2.getStuUniversity());
		
		System.out.print("����:" + s3.getStuName());
		System.out.print(",�Ա�:" + s3.getStuSex());
		System.out.print(",����:" + s3.getStuAge());
		System.out.print(",רҵ:" + s3.getStuMajor());
		System.out.print(",ѧԺ:"+ s3.getStuCollege());
		System.out.println(",ѧУ:"+s3.getStuUniversity());
	}

}
