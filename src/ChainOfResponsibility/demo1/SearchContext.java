package ChainOfResponsibility.demo1;
//�����ѯ��������������:���󴫵���
public abstract class SearchContext {
	protected SearchContext successor;
	public void setSuccessor(SearchContext successor){
		this.successor = successor;
	}
	public abstract void search(String keyword);
}
