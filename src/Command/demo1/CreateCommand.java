package Command.demo1;

public class CreateCommand implements Command {
	private BoardScreen screen;
	public CreateCommand(BoardScreen screen) {
		// TODO Auto-generated constructor stub
		this.screen = screen;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		screen.create();

	}

}
