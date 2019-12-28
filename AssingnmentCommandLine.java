package deloittecore;

public class AssingnmentCommandLine {

	public static void main(String[] args) {
	String str1 =  args[0];
			for (int i = 0; i < str1.length(); i++) {
				System.out.println(str1.charAt(i));
			}
	     		StringBuffer check= new StringBuffer();
	     		check.append(str1);
	     		StringBuffer buff= new StringBuffer();
				buff.append(str1);
				System.out.println(buff.reverse());
				
          for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str1.length(); j++) {
				System.out.println(str1.charAt(j)+ " ");
				
			}
			
		}
	}
        		}
	

