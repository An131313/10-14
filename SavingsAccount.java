package account19;

public class SavingsAccount extends Account {
	
	public SavingsAccount( int x, double y){
		super( x, y);
	}
	
	public void withdraw(double x) {
		if(balance >= x) {
		balance -= x;
		}
	}
	
	public String toString() {
		return super.toString() + " Savings account";
	}
}
