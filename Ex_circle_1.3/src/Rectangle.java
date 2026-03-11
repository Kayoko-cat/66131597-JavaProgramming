
public class Rectangle {

	public class Retamgle {
	    private float length = 1.0f;  // chiều dài, mặc định = 1.0
	    private float width  = 1.0f;  // chiều rộng, mặc định = 1.0
	}
	
	public Rectangle() { }

	// Hàm tạo có tham số
	public Rectangle(float length, float width) {
	    this.length = length;
	    this.width  = width;
	}
	// getter setter
	public float getLength() {
	    return length;
	}
	public void setLength(float length) {
	    this.length = length;
	}

	public float getWidth() {
	    return width;
	}
	public void setWidth(float width) {
	    this.width = width;
	}
}
