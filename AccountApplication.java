package DeloitteCourse;

public class AccountApplication {

	public static void main(String[] args) {
		Account account = new Account();
		Account account1 = new Account(101,"mahesh",5000);
		Account account2 = new Account(102,"satish",6000);
		System.out.println(account.getAccountNumber()+" "+account.getCustomerName()+" "+account.getBalance());
		System.out.println(account1.getAccountNumber()+" "+account1.getCustomerName()+" "+account1.getBalance());
		System.out.println(account2.getAccountNumber()+" "+account2.getCustomerName()+" "+account2.getBalance());
	}

}
