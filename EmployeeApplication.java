package DeloitteCourse;

public class EmployeeApplication {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setCity("hyd");
		employee.setCustomerId(101);
		employee.setCustomerName("mahesh");

		System.out.println(employee.getCustomerId());
		System.out.println(employee.getCustomerName());
		System.out.println(employee.getCity());
	}

}
