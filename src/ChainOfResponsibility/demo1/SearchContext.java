package ChainOfResponsibility.demo1;
//抽象查询请求处理上下文类:抽象传递者
public abstract class SearchContext {
	protected SearchContext successor;
	public void setSuccessor(SearchContext successor){
		this.successor = successor;
	}
	public abstract void search(String keyword);
}
