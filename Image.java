
public class Image {

	public Boolean blurred;
	public Double width;
	public Double length;
	public Integer rotated;
	public Image(Boolean blurred, Double width, Double length, Integer rotated) {
		
		this.blurred = blurred;
		this.width = width;
		this.length = length;
		this.rotated = rotated;
	}
	public void resize(Double width, Double length) {
		
		this.width = width;
		this.length = length;
		System.out.println("size: " + this.width + " x " + this.length);
	}
	public void rotate(Integer rotated) {
		
		this.rotated = rotated;
		System.out.println("rotated: " + this.rotated);
	}
	public void blur(Boolean blurred) {
		
		this.blurred = blurred;
		System.out.println("blurred: " + this.blurred);
	}
	@Override
	public String toString() {
		return "Image [blurred=" + blurred + ", width=" + width + ", length=" + length + ", rotated=" + rotated + "]";
	}
	
	
}
