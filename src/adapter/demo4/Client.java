package adapter.demo4;
/*
 * ������ģʽʵ��4֮����������
 * ĳϵͳ��Ҫ�ṩһ������ģ��,���û���Ϣ(������Ȼ�����Ϣ)����֮���ٴ洢�����ݿ���
 * ϵͳ�Ѿ�����������ݿ�����ࡣΪ����߿���Ч��,����Ҫ�������еļ����㷨,��Щ�㷨
 * ��װ��һЩ�ɵ������ṩ������,��Щ����û��Դ���롣ʹ��������ģʽ��Ƹü���ģ��,ʵ��
 * �ڲ��޸�������Ļ��������õĵ��������ܷ���
 */
public class Client {
	public static void main(String[] args) {
		DataOperation dao = (DataOperation) XMLUtil.getBean();
		dao.setPassword("sunnyLiu");
		String ps = dao.getPassword();
		String es = dao.doEncrypt(6, ps);
		System.out.println("����Ϊ:"+ps);
		System.out.println("����Ϊ:"+es);
		
	}
}
