
public class ResizeCommand extends ImageCommand{

	Double width, length;
	Double keepedWidth;
	Double keepedLength;
	public ResizeCommand(Image image, Double width, Double length) {
		
		super(image);
		this.image = image;
		this.width = width;
		this.length = length;
		keepedWidth = this.image.width;
		keepedLength = this.image.length;
	}
	public void execute() {
		
		image.resize(this.width, this.length);
	}
	public void undo() {
		
		image.resize(keepedWidth, keepedLength);
		System.out.println("size: " + this.width + " x " + this.length);
	}
}
