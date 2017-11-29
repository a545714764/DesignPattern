package Command.demo1;
/*
 * 某软件公司欲开发一个基于Windows平台的公告板系统.系统提供一个主菜单(Menu)
 * 在主菜单中包含了一些菜单项(MenuItem),可以通过Menu类的addMenuItem()方法增加菜单项
 * 菜单项的主要方法是click(),每一个菜单项包含一个抽象命令类,具体命令类包括OpenCommand(打开命令)
 * CreateCommand(新建命令),EditCommands(编辑命令)等,命令类具有一个execute()方法
 * 用于调用公告板系统界面类(BoardScreen)的open(),create(),edit()等方法
 * 现使用命令模式设计该系统,使得MenuItem类与BoardScreen类的耦合度降低,绘制类图并编程实现
 */
public class Client {

	public static void main(String[] args) {

		BoardScreen screen = new BoardScreen();
		Menu menu = screen.getMenu();
		
		Command openCommand,createCommand,editCommand;
		openCommand = new OpenCommand(screen);
		createCommand = new CreateCommand(screen);
		editCommand = new EditCommand(screen);
		
		MenuItem openItem,createItem,editItem;
		openItem = menu.itemList.get(0);
		createItem = menu.itemList.get(1);
		editItem = menu.itemList.get(2);
		
		openItem.setCommand(openCommand);
		createItem.setCommand(createCommand);
		editItem.setCommand(editCommand);
		
		screen.display();
		openItem.click();
		createItem.click();
		editItem.click();
	}

}
