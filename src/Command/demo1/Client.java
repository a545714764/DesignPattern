package Command.demo1;
/*
 * ĳ�����˾������һ������Windowsƽ̨�Ĺ����ϵͳ.ϵͳ�ṩһ�����˵�(Menu)
 * �����˵��а�����һЩ�˵���(MenuItem),����ͨ��Menu���addMenuItem()�������Ӳ˵���
 * �˵������Ҫ������click(),ÿһ���˵������һ������������,�������������OpenCommand(������)
 * CreateCommand(�½�����),EditCommands(�༭����)��,���������һ��execute()����
 * ���ڵ��ù����ϵͳ������(BoardScreen)��open(),create(),edit()�ȷ���
 * ��ʹ������ģʽ��Ƹ�ϵͳ,ʹ��MenuItem����BoardScreen�����϶Ƚ���,������ͼ�����ʵ��
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
