package account19;

import java.util.Date;

public class Account {
	private int id = 0;
	protected double balance = 0;
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
	
	public void withdraw(double x) {
		this.balance -= x;
	}
	
	public void deposit(double y) {
		this.balance += y;
	}
	
	public String toString() {
		return "Balance: " + balance;
	}
}
