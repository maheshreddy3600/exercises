package deloittecore;

public abstract class Shape {

	protected int length;
	protected int breadth;
	protected int radius;
	protected double pi = 3.14;
	
	public Shape(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		
	}
	public Shape(int radius) {
		super();
		this.radius = radius;
	}
	abstract void area();
	public static void main(String[] args) {
		
	}

}
