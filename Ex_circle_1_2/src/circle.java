
public class circle {

	private double radius = 1.0;
	
	// constructor 
	public circle() {}
	public circle(double radius) {
		this.radius = radius;
	}
	// getter & setter
	public double getRadius() {
		return 	radius;
	}
	public void setRadius(double radius) {
	  this.radius = radius;	
	}
	
	 public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    // Bước 5: Chu vi = 2 * π * r
	    public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }
	    // toString
	    public String toString() {
	        return "Hình tròn[bán kính=" + radius + "]";
	    }
	
}
