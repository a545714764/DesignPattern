package ChainOfResponsibility.demo1;
//�����ѯ��������������:���崫����
public class JavaSearchContext extends SearchContext {

	@Override
	public void search(String keyword) {
		if(keyword.contains("java")){
			System.out.println("��ѯ�ؼ���Java!");
		}else{
			successor.search(keyword);
		}
	}

}
