/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.stock.resource;

import java.util.List;
import org.stock.models.AccountTransaction;


/**
 *
 * @author Winter
 */
public class AccountTransactionDAO {
	public static List<AccountTransaction> getAll(){
		List<AccountTransaction> account_transactions = null;
		return account_transactions;
	}
	
	public static void save(AccountTransaction account_transaction) {
		
	}
	
	public static List<AccountTransaction> getTransactions(String account_holder){
		List<AccountTransaction> account_transactions = null;
		return account_transactions;
	}
}