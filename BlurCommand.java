
public class BlurCommand extends ImageCommand{

	Boolean blurred;
	Boolean keepedBlurred;
	public BlurCommand(Image image, Boolean blurred) {
		
		super(image);
		this.image = image;
		this.blurred = blurred;
		keepedBlurred = this.image.blurred;
	}
	public void execute() {
		
		image.blur(this.blurred);
	}
	public void undo() {
		
		image.blur(keepedBlurred);
		System.out.println("blurred: " + this.blurred);
	}
}
