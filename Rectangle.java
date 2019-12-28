package deloittecore;

public class Rectangle extends Shape {

	public Rectangle(int length, int breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle is"+(length*breadth));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int j = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
		Shape rectangle = new Rectangle(j,k);
		rectangle.area();
	}

	
}
