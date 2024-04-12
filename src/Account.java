import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Account {
	private LocalDate currentDate = LocalDate.now();
	private String accountName = "Account";
	private double balance = 0;
	private Transactor transactor;
	protected ArrayList<Transaction> transactions = new ArrayList<>();

	public Account(String accountName) {
		this.accountName = accountName;
		this.transactor = new DefaultTransactor();
	}

    // Getters
	public double getBalance() {
		this.balance = 0;

		for (Transaction transaction : getTransactions()) {
			this.balance += transaction.getAmount();
		}

		return this.balance;
	}

	public LocalDate getCurrentDate() {
		return currentDate;
	}

	public ArrayList<Transaction> getTransactions() {
    ArrayList<Transaction> tempList = new ArrayList<>();
    tempList.addAll(transactions);

    Collections.sort(tempList, Comparator.comparing(Transaction::getDate).reversed());
    return tempList;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setaccountName(String accountName) {
		this.accountName = accountName;
	}

	// Use Transactor for deposit and withdraw methods
	public void deposit(LocalDate date, double amount) {
		transactor.increment(this, amount);

		Transaction depositTransaction = new Transaction(date, amount, "Deposit");
		transactions.add(depositTransaction);
	}

	public void deposit(LocalDate date, double amount, String description) {
		transactor.increment(this, amount);

		Transaction depositTransaction = new Transaction(date, amount, "Deposit", description);
		transactions.add(depositTransaction);
	}

	public void withdraw(LocalDate date, double amount) {
		transactor.decrement(this, amount);

		Transaction depositTransaction = new Transaction(date, amount, "Withdraw");
		transactions.add(depositTransaction);
	}

	public void withdraw(LocalDate date, double amount, String description) {
		transactor.decrement(this, amount);

		Transaction withdrawTransaction = new Transaction(date, amount, "Withdraw", description);
		transactions.add(withdrawTransaction);
	}

	public void setBalance(double d) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setBalance'");
	}
}