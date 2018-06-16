/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.stock.resource;

import java.util.List;

/**
 *
 * @author Winter
 */
public class BankAccountDAO {
	public static List<BankAccount> getAll(){
		List<BankAccount> bank_accounts = null;
		return bank_accounts;
	}
	
	public static BankAccount withdraw(BankAccount bank_account,double trans_amount) {
		return bank_account;
	}
	
	public static BankAccount deposit(BankAccount bank_account,double trans_amount) {
		return bank_account;
	}
	
	public static void save(BankAccount bank_account) {
		
	}
}
