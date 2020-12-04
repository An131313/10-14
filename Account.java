package account;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double yearInterestRate  = 0;
	private Date dateCreated = new Date();
	
	public Account(){
		
	}
	
	public Account( int x, double y){
		this.setId(x);
		this.setBalance(y);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getYearInterestRate() {
		return yearInterestRate;
	}

	public void setYearInterestRate(double yearInterestRate) {
		this.yearInterestRate = yearInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = (yearInterestRate / 100) / 12 ;
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest () {
		double monthlyInterest = balance * getMonthlyInterestRate();
		return monthlyInterest;
	}
	
	public double withdraw(double x) {
		
		return this.balance -= x;
	}
	
	public double deposit(double y) {
		return this.balance += y;
	}
	
}
