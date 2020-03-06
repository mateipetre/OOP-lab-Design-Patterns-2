
public class CommandTester {

	public CommandTester() {
		
	}

	public static void main(String[] args) {
		
		Image image = new Image(false, 5.00, 10.00, 90);
		ImageCommand command1 = new ResizeCommand(image, 7.00, 9.00);
		ImageCommand command2 = new RotateCommand(image, 180);
		ImageCommand command3 = new BlurCommand(image, true);
		Invoker invoker = new Invoker();
		invoker.takeCommand(command1);
		invoker.takeCommand(command2);
		invoker.takeCommand(command3);
	
		System.out.println("Imaginea s-a schimbat dupa executarea comenzilor astfel:");
		invoker.placeCommands(image);
		
		System.out.println("Imaginea s-a schimbat dupa undo comenzi astfel:");
		invoker.undoCommands(image);
		
	}
}
