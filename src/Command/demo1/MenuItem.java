package Command.demo1;

public class MenuItem {
	private String name;
	private Command command;
	public MenuItem(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	public void click(){
		command.execute();
	}
}
