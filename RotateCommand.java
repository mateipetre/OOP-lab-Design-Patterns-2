
public class RotateCommand extends ImageCommand{

	Integer rotated;
	Integer keepedRotated = this.image.rotated;
	public RotateCommand(Image image, Integer rotated) {
	
		super(image);
		this.image = image;
		this.rotated = rotated;
		keepedRotated = this.image.rotated;
	}
	public void execute() {
		
		image.rotate(this.rotated);
	}
	public void undo() {
		
		image.rotate(keepedRotated);
		System.out.println("rotated: " + this.rotated);
	}
}
