package com.maxtrian.banking;

public class Savings extends Account {

	public Savings(String string){
		super();
	}
		
	private double interestRate = .12;
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	public void payInterest(int months) throws Exception {
		var interest = calculateInterest(months);
		deposit(interest);
	}
	
	private double calculateInterest(int months) {
		if
		(months < 1) {
			return 0;
		}
		return getBalance() * (getInterestRate() / 12) * months;
	}
	
	
	
}
