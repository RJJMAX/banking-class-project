package com.maxtrian.banking;

public class Program {

	public static void main(String[] args) {
		
		try {
		
		var account = new Account("Account 1");
		account.deposit(1000);
		System.out.printf("%s", account.toString());
		account.withdraw(50);
		System.out.printf("%s", account.toString());
		
		var account3 = new Savings("Savings 1");
		account.transfer(75, account3);
		System.out.printf("%s%s", account.toString(), account3.toString());
		account3.payInterest(5);
		System.out.printf("%s", account.toString());
		
		
		
		} catch(Exception ex) {
			System.out.printf("EXCEPTION: %s%n", ex.getMessage());
		}
		
		
		
		//System.out.println(Account.nextid);
		
	}

}
