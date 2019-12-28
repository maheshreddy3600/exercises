package deloittecore;

public class AssignmentDaysInMonth {

	public static void main(String[] args) {
		String str = args[0];
		switch(str)
		{
		case "jan":
			System.out.println("January Has 31 days");
			break;
		case "feb":
			System.out.println("feb Has 28 days");
			break;
		case "mar":
			System.out.println("mar Has 31 days");
			break;
		case "apr":
			System.out.println("apr Has 30 days");
			break;
		case "may":
			System.out.println("may Has 31 days");
			break;
		case "jun":
			System.out.println("June Has 30 days");
			break;
		case "july":
			System.out.println("July Has 31 days");
			break;
		case "aug":
			System.out.println("aug Has 31 days");
			break;
		case "sep":
			System.out.println("sep Has 31 days");
			break;
		case "oct":
			System.out.println("oct Has 31 days");
			break;
		case "nov":
			System.out.println("nov Has 31 days");
			break;
		case "dec":
			System.out.println("dec Has 31 days");
			break;
			default:
				System.out.println("enter valid input");
				
		}
	}

}
