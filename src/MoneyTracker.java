import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class MoneyTracker {
	UI ui = new UI();
	User user = new User();
	private DefaultTableModel tableModel;

	public void init() {
		setup();
	}

	private void setup() {
		ui.setAccountName(user.getName());
		ui.setTotalAccBalance(new DecimalFormat("0.00").format(user.getTotalBalance())); //Convert totalBalance to String
		displayLatestTransactions();
		displayTransactions();
	}

	private void displayLatestTransactions() {
		String[] columnNames = {"Transactions", "Amount"};
		tableModel = new DefaultTableModel(columnNames, 0);
		ui.getTblTransPreview().setModel(tableModel);

		// Get the latest 3 transactions from the sorted list
		ArrayList<Transaction> latestTransactions = new ArrayList<>(user.getTransactionsList().subList(0, Math.min(3, user.getTransactionsList().size())));

		// Add the latest transactions to the table model
		for (Transaction transaction : latestTransactions) {
			Object[] rowData = {transaction.getDescription(), transaction.getAmount()};
			tableModel.addRow(rowData);
		}
	}

	private void displayTransactions() {
		String[] columnNames = {"Date", "Account", "Type of Transaction", "Description"};
		tableModel = new DefaultTableModel(columnNames, 0);
		ui.getTblTransactions().setModel(tableModel);
    tableModel.setRowCount(0); // Clear existing rows

 
    for (Transaction transaction : user.getTransactionsList()) {
			Object[] rowData = {transaction.getDate(), transaction.getAccountName(), transaction.getType(), transaction.getDescription()};
			tableModel.addRow(rowData);
    }
    
	}

	public boolean logInSuccessful() {
		return true;
	}
}