package day_7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		String dob = "31-12-2019";
		Date dt = new Date();
		System.out.println(dt);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		dt = sdf.parse(dob);
		System.out.println(dt);
	}

}
