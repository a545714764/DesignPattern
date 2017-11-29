package Command.demo1;

public class OpenCommand implements Command {
	private BoardScreen screen;
	public OpenCommand(BoardScreen screen) {
		// TODO Auto-generated constructor stub
		this.screen = screen;
	}
	@Override
	public void execute() {
		screen.open();
	}

}
