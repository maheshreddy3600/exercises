package deloittecore;

public class Palindrome {

	public static void main(String[] args) {
		String str1 =  args[0];
		StringBuffer check= new StringBuffer();
 		check.append(str1);
 		
 		StringBuffer buff= new StringBuffer();
		buff.append(str1);
		System.out.println(buff.reverse());	
		buff = buff.reverse();
		
           if(check.equals(buff)){

        	   System.out.println("Palindrome");

           }

           else{

        	   System.out.println(" Not Palindrome");

           }
           System.out.println(check);
           System.out.println(buff);
	}

}
