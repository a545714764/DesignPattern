package ChainOfResponsibility.demo1;
//�����ѯ��������������:���崫����
public class SQLSearchContext extends SearchContext {

	@Override
	public void search(String keyword) {
		if(keyword.contains("SQL")){
			System.out.println("��ѯ�ؼ���SQL!");
		}else{
			successor.search(keyword);
		}
	}

}
