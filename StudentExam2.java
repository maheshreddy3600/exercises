package deloittecore;

public class StudentExam2 extends Library1{
          private int sub1;
          private int sub2;

public StudentExam2(int regno,String name, int booksissued, int sub1, int sub2) {
			super(regno, name, booksissued);
			this.sub1 = sub1;
			this.sub2 = sub2;
		}

public void display(){
	System.out.println("from sub class");
}

public void output(){
	int total = sub1+sub2;
	System.out.println(regno+" "+name+" "+booksissued+" "+" "+sub1+" "+sub2+" "+total);
}
	public static void main(String[] args) {
		Student student = new Student();
		StudentExam2 exam2 = new StudentExam2(121,"mahesh",5,50,50);
		exam2.output();
	student.display();
	student = exam2;
	exam2.display();

	}

}
