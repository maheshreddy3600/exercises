package deloittecore;

public class StringOperations {

	public static void main(String[] args) {
		String str1="deloitte";
		System.out.println("length"+str1.length());
		System.out.println(str1.lastIndexOf('i'));
		System.out.println(str1.charAt(4));
		System.out.println(str1.isEmpty());
		System.out.println(str1.substring(3));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.concat("hyderabad"));
		System.out.println(str1);
		System.out.println(str1.compareTo("Deloitte"));
		System.out.println(str1.equals("Deloitte"));
		//str1 = str1.append("hyderabad");
		System.out.println(str1);
		}

}
