package ChainOfResponsibility.demo1;
/*
 * ĳ��˾������һ�����ϵͳ�������ĵ�����ϵͳ,�û��������κ�һ����ѯ����������ؼ���
 * �����ǰ��ѯ������û���������,��ϵͳ�Ὣ��ѯ����һ����˳��ת����������ѯ����.
 * ������������,����ְ����ģʽ�Ը�ϵͳ�������
 */
public class Client {
	public static void main(String[] args) {
		SearchContext jContext,sContext,uContext;
		jContext = new JavaSearchContext();
		sContext = new SQLSearchContext();
		uContext = new UMLSearchContext();
		jContext.setSuccessor(sContext);
		sContext.setSuccessor(uContext);
		String keyword = "UML��ͼ�����ɻ�";
		jContext.search(keyword);
	}


}
