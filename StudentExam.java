package deloittecore;

public class StudentExam extends Student {
private int sub1;
private int sub2;

	public StudentExam(int regno, String name, int sub1, int sub2) {
	super(regno, name);
	this.sub1 = sub1;
	this.sub2 = sub2;
}
public void output(){
	int total = sub1 + sub2;
	System.out.println(regno+name+total);
}

	public static void main(String[] args) {

		StudentExam exam = new StudentExam(123,"abc",50,90);
		exam.output();
	}

}
