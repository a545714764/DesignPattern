package Command.demo1;

public class EditCommand implements Command {
	private BoardScreen screen;
	public EditCommand(BoardScreen screen) {
		
		this.screen = screen;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		screen.edit();

	}

}
