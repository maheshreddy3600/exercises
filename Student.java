package deloittecore;

public class Student {
      protected int regno;
      protected String name;
      
      public Student(){
    	  
      }
	public Student(int regno, String name) {
		super();
		this.regno = regno;
		this.name = name;
	}
public void display(){
	System.out.println("super class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
