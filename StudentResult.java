package deloittecore;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int regno,sub1,sub2,sub3,total;
		double average;
	    regno=101;
		sub1=60;
		sub2=40;
		sub3=39;
		
		if((sub1<=39) || (sub2<=39) || (sub3<=39)){
			
			System.out.println("student has Failed in the Exam");
		}
		else{
			System.out.println("Pass");
			total = sub1+ sub2+ sub3;
			average= sub1 + sub2+ sub3;
		}
	}

}
