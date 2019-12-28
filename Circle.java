package deloittecore;

public class Circle extends Shape {
		
	public Circle(int length, int breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of the circle is"+(pi*radius*radius));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int i = Integer.parseInt(args[2]);
		Shape circle = new Circle(i);
		circle.area();
	}

	

}
