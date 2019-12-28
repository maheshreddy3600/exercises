package deloittecore;

public class ClassOneApplication extends ClassOne {

	
	public ClassOneApplication(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	void output() {
		// TODO Auto-generated method stub
		System.out.println("output method of child class");
	}

	
	public static void main(String[] args) {
		
		ClassOne one = new ClassOneApplication(5, 6);
		one.output();

	}




}
