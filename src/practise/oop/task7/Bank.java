package practise.oop.task7;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String name;
	private ArrayList<Account> accountsList = new ArrayList<Account>();

	public Bank(String name) {
		this.name = name;
	}

	public void addAccountToList(Account account) {
		this.accountsList.add(account);
	}

	public void addAccountsToList(Account[] accounts) {
		this.accountsList.addAll(List.of(accounts));
	}

	public void removeAccountFromList(Account account) {
		accountsList.remove(account);
	}

	public void withdrawMoneyFromAccount(Account account, double amount) {
		account.setAmount(account.getAmount() - amount);
	}

	public void depositMoneyToAccount(Account account, double amount) {
		account.setAmount(account.getAmount() + amount);
	}

	public ArrayList<Account> getAccountsList() {
		return this.accountsList;
	}
}