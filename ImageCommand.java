
public abstract class ImageCommand {

	public Image image;
	public ImageCommand(Image image) {
		
		this.image = image;
	}
	public abstract void execute();
	public abstract void undo();
}
