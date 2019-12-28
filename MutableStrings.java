package deloittecore;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer();  //synchronized or thread safe
		sb1.append("deloitte");
		System.out.println(sb1);
		sb1.append("hyderabad");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.delete(7, 10));
		System.out.println(sb1.reverse());
		System.out.println(sb1.replace(6, 11, "java"));
		String str="dabang3";
		StringBuffer sb2=new StringBuffer();
		sb2.append(str);
		System.out.println(sb2);
		String str2 = sb2.toString();
		System.out.println(str2);
		StringBuilder builder = new StringBuilder();   //asynchronized
		builder.append("abcde");
		
		
	}

}
