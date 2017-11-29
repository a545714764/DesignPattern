package Command.demo1;

public class BoardScreen {
	private Menu menu;
	private MenuItem openItem,createItem,editItem;
	public BoardScreen(){
		menu = new Menu();
		openItem = new MenuItem("��");
		createItem = new MenuItem("�½�");
		editItem = new MenuItem("�༭");
		menu.addMenuItem(openItem);
		menu.addMenuItem(createItem);
		menu.addMenuItem(editItem);
	}
	public void display(){
		System.out.println("���˵�ѡ��:");
		for(Object obj:menu.itemList){
			System.out.println(((MenuItem)obj).getName());
		}
	}
	public void open(){
		System.out.println("��ʾ�򿪴���!");
	}
	public void create(){
		System.out.println("��ʾ�½�����!");
		
	}
	public void edit(){
		System.out.println("��ʾ�༭����!");
	}
	public Menu getMenu(){
		return menu;
	}
}
