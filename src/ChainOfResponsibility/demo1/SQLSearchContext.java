package ChainOfResponsibility.demo1;
//具体查询请求处理上下文类:具体传递者
public class SQLSearchContext extends SearchContext {

	@Override
	public void search(String keyword) {
		if(keyword.contains("SQL")){
			System.out.println("查询关键字SQL!");
		}else{
			successor.search(keyword);
		}
	}

}
