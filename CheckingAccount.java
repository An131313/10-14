package account19;

public class CheckingAccount extends Account {
	private double overDraftLimit;
	
	public CheckingAccount( int x, double y, double z){
		super( x, y);
		setOverDraftLimit(z);
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	public void withdraw(double x) {
		if(balance + overDraftLimit >= x) {
		balance -= x;
		}
	}

	public String toString() {
		return super.toString() + " Checking account";
	}
}
