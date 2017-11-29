package PrototypePattern.demo5;
/*
 * 原型模式:相似对象的复制
 * 很多情况下,复制所得到的对象与原型对象并不是完全相同的,它们的某些属性值存在异同
 * 通过原型模式获得相同对象后可以再次对其属性进行修改,从而获取所需对象
 * 如多个学生对象的信息的区别在于性别、姓名和年龄,而专业、学院、学校等信息都相同
 * 为了简化创建过程,可以通过原型模式来实现相似对象的复制
 */
public class Client {

	public static void main(String[] args) {
		Student s1,s2,s3;
		
		s1 = new Student("张无忌", "男", 24, "软件工程", "软件学院", "中南大学");
		
		s2 = s1.clone();
		s2.setStuName("杨过");
		
		s3 = s1.clone();
		s3.setStuName("小龙女");
		s3.setStuSex("女");
		
		System.out.print("姓名:" + s1.getStuName());
		System.out.print(",性别:" + s1.getStuSex());
		System.out.print(",年龄:" + s1.getStuAge());
		System.out.print(",专业:" + s1.getStuMajor());
		System.out.print(",学院:"+ s1.getStuCollege());
		System.out.println(",学校:"+s1.getStuUniversity());
		
		System.out.print("姓名:" + s2.getStuName());
		System.out.print(",性别:" + s2.getStuSex());
		System.out.print(",年龄:" + s2.getStuAge());
		System.out.print(",专业:" + s2.getStuMajor());
		System.out.print(",学院:"+ s2.getStuCollege());
		System.out.println(",学校:"+s2.getStuUniversity());
		
		System.out.print("姓名:" + s3.getStuName());
		System.out.print(",性别:" + s3.getStuSex());
		System.out.print(",年龄:" + s3.getStuAge());
		System.out.print(",专业:" + s3.getStuMajor());
		System.out.print(",学院:"+ s3.getStuCollege());
		System.out.println(",学校:"+s3.getStuUniversity());
	}

}
