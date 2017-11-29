package Command.demo1;

public class BoardScreen {
	private Menu menu;
	private MenuItem openItem,createItem,editItem;
	public BoardScreen(){
		menu = new Menu();
		openItem = new MenuItem("打开");
		createItem = new MenuItem("新建");
		editItem = new MenuItem("编辑");
		menu.addMenuItem(openItem);
		menu.addMenuItem(createItem);
		menu.addMenuItem(editItem);
	}
	public void display(){
		System.out.println("主菜单选项:");
		for(Object obj:menu.itemList){
			System.out.println(((MenuItem)obj).getName());
		}
	}
	public void open(){
		System.out.println("显示打开窗口!");
	}
	public void create(){
		System.out.println("显示新建窗口!");
		
	}
	public void edit(){
		System.out.println("显示编辑窗口!");
	}
	public Menu getMenu(){
		return menu;
	}
}
