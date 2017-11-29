package ChainOfResponsibility.demo1;
/*
 * 某公司欲开发一个软件系统的在线文档帮助系统,用户可以在任何一个查询环境中输入关键字
 * 如果当前查询环境下没有相关内容,则系统会将查询按照一定的顺序转发给其他查询环境.
 * 基于上述需求,采用职责链模式对该系统进行设计
 */
public class Client {
	public static void main(String[] args) {
		SearchContext jContext,sContext,uContext;
		jContext = new JavaSearchContext();
		sContext = new SQLSearchContext();
		uContext = new UMLSearchContext();
		jContext.setSuccessor(sContext);
		sContext.setSuccessor(uContext);
		String keyword = "UML类图绘制疑惑";
		jContext.search(keyword);
	}


}
