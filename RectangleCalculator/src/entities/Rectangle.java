package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double Area() {
		return this.height*this.width;
	}
	
	public double Perimeter() {
		return 2*(width+height);
	}
	
	public double Diagonal() {
		return Math.sqrt(width*width+height*height);
	}
	
	public String toString() {
		return "Area: "
				+String.format("%.2f", Area())
				+"\nPerimeter: "
				+String.format("%.2f", Perimeter())
				+"\nDiagonal: "
				+String.format("%.2f", Diagonal());
				
	}
	

}
