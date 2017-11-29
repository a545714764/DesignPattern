package ChainOfResponsibility.demo1;
//具体查询请求处理上下文类:具体传递者
public class UMLSearchContext extends SearchContext {

	@Override
	public void search(String keyword) {
		if(keyword.contains("UML")){
			System.out.println("查询关键字UML!");
		}else{
			successor.search(keyword);
		}
	}

}
