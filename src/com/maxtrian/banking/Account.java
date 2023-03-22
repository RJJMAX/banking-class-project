package com.maxtrian.banking;

import java.util.UUID;

public class Account {
	
	private static int nextid = 1;
	private String description;
	private double balance = 0;
	
	
	public void deposit(double amount) throws Exception {
		checkAmountGreaterThanZero(amount);
		setBalance(getBalance() + amount);
		
	} 
	
	private void checkAmountGreaterThanZero(double amount) throws Exception {
		if(amount <= 0)
			throw new Exception("Amount must be positive");
	}
	
	
	public void withdraw(double amount) throws Exception {
		checkAmountGreaterThanZero(amount);
		checkInsufficientFunds(amount);
		setBalance(getBalance() - amount);
		
	} 
	
	private void checkAmountMoreThanZero(double amount) throws Exception {
		if(amount <= 0)
			throw new Exception("Withdraw amount must be positive");
	}
	
	private void checkInsufficientFunds(double amount) throws Exception {
		if(amount > getBalance()) {
			throw new Exception("Insufficient Funds!");
		}
	}
	
	
	public void transfer(double amount, Account toAccount) throws Exception {
		withdraw(amount);
		toAccount.deposit(amount);
		
	} 
	
	private void checkAmountEvenGreaterThanZero(double amount) throws Exception {
		if(amount <= 0)
			throw new Exception("Transfer amount must be positive");
	}

	private void checkInsufficientFunding(double amount) throws Exception {
		if(amount > getBalance()) {
			throw new Exception("Insufficient Funds!");
		}
	}

	public String toString() {
		return String.format("%2d | %-15s | %, 7.2f%n", getId(), getDescription(), getBalance());
	}
	
	public Account(String description) {
		setId(nextid++);
		setDescription(description);
		setBalance(0);
	}
	
	public Account() {
		this("New Account");
	}
	


	
	
	//private UUID id = UUID.randomUUID();
	
	
	public int getId() {
		return nextid;
	}
	private void setId(int id) {
		this.nextid = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
