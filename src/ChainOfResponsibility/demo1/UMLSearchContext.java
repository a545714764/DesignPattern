package ChainOfResponsibility.demo1;
//�����ѯ��������������:���崫����
public class UMLSearchContext extends SearchContext {

	@Override
	public void search(String keyword) {
		if(keyword.contains("UML")){
			System.out.println("��ѯ�ؼ���UML!");
		}else{
			successor.search(keyword);
		}
	}

}
