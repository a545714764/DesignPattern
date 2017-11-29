package ChainOfResponsibility.demo1;
//具体查询请求处理上下文类:具体传递者
public class JavaSearchContext extends SearchContext {

	@Override
	public void search(String keyword) {
		if(keyword.contains("java")){
			System.out.println("查询关键字Java!");
		}else{
			successor.search(keyword);
		}
	}

}
