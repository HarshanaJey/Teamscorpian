package controllers;
import entities.*;

public class Bank {
	
	public BankAccount createBankAccount(String name, float initialAmount) {
		return new BankAccount(name, initialAmount);
	}
	
	public BankAccount getBankAccount(String name) {
		return BankAccount.getAccount(name);
	}
}
