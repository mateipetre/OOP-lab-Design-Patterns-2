import java.util.ArrayList;
import java.util.List;

public class Invoker {
    
	private List<ImageCommand> commandList = new ArrayList<ImageCommand>();
	public Invoker() {
		
	}
	public void takeCommand(ImageCommand command){
	      commandList.add(command);		
	   }

	public void placeCommands(Image image){
	   
	    for (ImageCommand command : commandList) {
	         command.execute();
	         System.out.println(image);
	    }
	 }
	public void undoCommands(Image image) {
		
		for (ImageCommand command : commandList) {
	         command.undo();
	         System.out.println(image);
	    }
	}
}
