package account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account jaemin = new Account( 1122, 20_000);
		jaemin.setYearInterestRate(4.5);
		jaemin.withdraw(2500);
		jaemin.deposit(3000);
		System.out.println("Date created: " + jaemin.getDateCreated());
		System.out.println("Balance: " + jaemin.getBalance());
		System.out.println("Monthly interest: " + jaemin.getMonthlyInterest());
	}
}
