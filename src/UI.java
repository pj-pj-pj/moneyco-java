import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.text.NumberFormatter;

import org.jdatepicker.impl.*; 
import java.awt.*;  

public class UI extends javax.swing.JFrame {
public UI() {
	initComponents();
}

private void initComponents() {
	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	setBackground(new java.awt.Color(102, 102, 102));
	setFont(new java.awt.Font("Raleway", 0, 10)); // NOI18N
	
	Image icon = Toolkit.getDefaultToolkit().getImage("src/assets/Icon.png");    
	setIconImage(icon);    
	setLayout(null);

	headerInit();
	sidebarInit();
	contentPanelInit();

	pack();
	setLocationRelativeTo(null);
	setVisible(true);
	setSize(1013, 570);
	setResizable(false);
}            

private void headerInit() {
	header = new javax.swing.JPanel();
	jLabel1 = new javax.swing.JLabel();
	btnAddTransaction = new java.awt.Button();

	header.setBackground(new java.awt.Color(102, 102, 102));

	jLabel1.setFont(new java.awt.Font("IM FELL DW Pica", 0, 24)); // NOI18N
	jLabel1.setForeground(new java.awt.Color(255, 255, 255));
	jLabel1.setText("Money.co");

	btnAddTransaction.setBackground(new java.awt.Color(0, 0, 0));
	btnAddTransaction.setForeground(new java.awt.Color(255, 255, 255));
	btnAddTransaction.setLabel("+ ADD TRANSACTION");
	btnAddTransaction.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			btnAddTransactionActionPerformed(evt);
		}
	});

	javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
	header.setLayout(headerLayout);
	headerLayout.setHorizontalGroup(
		headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
			.addGap(34, 34, 34)
			.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 539, Short.MAX_VALUE)
			.addComponent(btnAddTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(12, 12, 12))
	);
	headerLayout.setVerticalGroup(
		headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
			.addContainerGap()
			.addComponent(btnAddTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addContainerGap())
		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
			.addContainerGap(17, Short.MAX_VALUE)
			.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(18, 18, 18))
	);
}

private void sidebarInit() {
	sidebar = new javax.swing.JPanel();
	pnlAccName = new javax.swing.JPanel();
	lblAccName = new javax.swing.JLabel();
	jLabel2 = new javax.swing.JLabel();
	lblTotalAccountBalance = new javax.swing.JLabel();
	btnViewAllAcc = new java.awt.Button();
	btnLogOut = new java.awt.Button();
	btnViewAllTrans = new java.awt.Button();
	lblYourTrans = new javax.swing.JLabel();
	jScrollPane3 = new javax.swing.JScrollPane();
	tblTransPreview = new javax.swing.JTable();

	sidebar.setBackground(new java.awt.Color(204, 204, 204));
	lblAccName.setBackground(new java.awt.Color(255, 255, 255));
	lblAccName.setFont(new java.awt.Font("IM FELL DW Pica", 0, 18)); // NOI18N
	lblAccName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	lblAccName.setText("account name");

	javax.swing.GroupLayout pnlAccNameLayout = new javax.swing.GroupLayout(pnlAccName);
	pnlAccName.setLayout(pnlAccNameLayout);
	pnlAccNameLayout.setHorizontalGroup(
		pnlAccNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(pnlAccNameLayout.createSequentialGroup()
			.addGap(69, 69, 69)
			.addComponent(lblAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);
	pnlAccNameLayout.setVerticalGroup(
		pnlAccNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(pnlAccNameLayout.createSequentialGroup()
			.addGap(14, 14, 14)
			.addComponent(lblAccName)
			.addContainerGap(15, Short.MAX_VALUE))
	);

	jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	jLabel2.setText("Total Account Balance:");

	lblTotalAccountBalance.setFont(new java.awt.Font("Poppins", 0, 17)); // NOI18N
	lblTotalAccountBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	lblTotalAccountBalance.setText("0.00");

	btnViewAllAcc.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
	btnViewAllAcc.setLabel("VIEW ALL ACCOUNTS >");
	btnViewAllAcc.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			btnViewAllAccActionPerformed(evt);
		}
	});

	btnLogOut.setBackground(new java.awt.Color(0, 0, 0));
	btnLogOut.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
	btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
	btnLogOut.setLabel("LOG OUT");

	btnViewAllTrans.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
	btnViewAllTrans.setLabel("VIEW ALL TRANSACTIONS >");
	btnViewAllTrans.setVisible(false);
	btnViewAllTrans.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			btnViewAllTransActionPerformed(evt);
		}
	});

	lblYourTrans.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	lblYourTrans.setText("Your Latest Transactions:");

	tblTransPreview.setModel(new javax.swing.table.DefaultTableModel(
		new Object [][] {
			{null, null},

		},
		new String [] {
			"Transactions", "Amount"
		}
	) {
		boolean[] canEdit = new boolean [] {
			false, false
		};

		public boolean isCellEditable(int rowIndex, int columnIndex) {
			return canEdit [columnIndex];
		}
	});
	jScrollPane3.setViewportView(tblTransPreview);

	javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
	sidebar.setLayout(sidebarLayout);
	sidebarLayout.setHorizontalGroup(
		sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(sidebarLayout.createSequentialGroup()
			.addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(sidebarLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(pnlAccName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(sidebarLayout.createSequentialGroup()
					.addGap(50,50,50)
					.addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
								.addComponent(btnViewAllTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(23, 23, 23))
							.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
								.addComponent(lblYourTrans)
								.addGap(0, 0, 30))
							.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
								.addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(23, 23, 23)))
						.addComponent(lblTotalAccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(0, 32, Short.MAX_VALUE)))
			.addContainerGap())
		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
			.addGap(0, 0, Short.MAX_VALUE)
			.addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
					.addComponent(jLabel2)
					.addGap(0, 45, 70))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
					.addComponent(btnViewAllAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(0, 45, 70))))
	);
	sidebarLayout.setVerticalGroup(
		sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(sidebarLayout.createSequentialGroup()
			.addContainerGap()
			.addComponent(pnlAccName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(18, 18, 18)
			.addComponent(jLabel2)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(lblTotalAccountBalance)
			.addGap(10,10,10)
			.addComponent(btnViewAllAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(20, 20, 20)
			.addComponent(lblYourTrans)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(btnViewAllTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(50, 50, 50))
	);
}

public void setAccountName(String name) {
	lblAccName.setText(name);
}

public void setTotalAccBalance(String total) {
	lblTotalAccountBalance.setText(total);
}

public JTable getTblTransPreview() {
	return tblTransPreview;
}

public JTable getTblAccList() {
	return tblAccList;
}

private void contentPanelInit() {
	contentPanel = new javax.swing.JPanel();
	cardViewAllTrans = new javax.swing.JPanel();
	cardMonth = new javax.swing.JPanel();
	jScrollPane2 = new javax.swing.JScrollPane();
	tblTransactions = new javax.swing.JTable();
	pnlAllAccHeader1 = new javax.swing.JPanel();
	jLabel18 = new javax.swing.JLabel();
	cardAddTransaction = new javax.swing.JPanel();
	pnlAddTransHeader = new javax.swing.JPanel();
	jLabel4 = new javax.swing.JLabel();
	jLabel6 = new javax.swing.JLabel();
	txtFieldAmount = new javax.swing.JTextField();
	jLabel8 = new javax.swing.JLabel();
	comboAccountList = new javax.swing.JComboBox<>();
	jLabel9 = new javax.swing.JLabel();
	jLabel10 = new javax.swing.JLabel();
	jLabel11 = new javax.swing.JLabel();
	comboTypeOfTransaction = new javax.swing.JComboBox<>();
	btnSaveTransaction = new java.awt.Button();
	txtFldDescription = new javax.swing.JTextField();
	cardViewAllAccounts = new javax.swing.JPanel();
	jSeparator1 = new javax.swing.JSeparator();
	jScrollPane1 = new javax.swing.JScrollPane();
	tblAccList = new javax.swing.JTable();
	cardViewAllAccounts1 = new javax.swing.JPanel();
	pnlAllAccHeader2 = new javax.swing.JPanel();
	jLabel17 = new javax.swing.JLabel();
	btnAddNewAcc = new java.awt.Button();
	jLabel19 = new javax.swing.JLabel();
	jLabel20 = new javax.swing.JLabel();
	jLabel21 = new javax.swing.JLabel();
	jLabel22 = new javax.swing.JLabel();
	jLabel23 = new javax.swing.JLabel();
	jLabel24 = new javax.swing.JLabel();
	jSeparator2 = new javax.swing.JSeparator();
	jScrollPane4 = new javax.swing.JScrollPane();
	cardAddNewAcc = new javax.swing.JPanel();
	pnlAddAccHeader3 = new javax.swing.JPanel();
	jLabel25 = new javax.swing.JLabel();
	jLabel26 = new javax.swing.JLabel();
	jTextField2 = new javax.swing.JTextField();
	jLabel27 = new javax.swing.JLabel();
	jComboBox3 = new javax.swing.JComboBox<>();
	jLabel30 = new javax.swing.JLabel();
	jLabel3 = new javax.swing.JLabel();
	txtBoxInitialBalance = new javax.swing.JTextField();
	btnSaveAccount = new java.awt.Button();
	jLabel31 = new javax.swing.JLabel();
	Calendar calendar = Calendar.getInstance();

	contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	contentPanel.setLayout(new java.awt.CardLayout());

	cardViewAllTrans.setPreferredSize(new java.awt.Dimension(655, 68));
	cardViewAllTrans.setLayout(new java.awt.CardLayout());

	cardMonth.setBackground(new java.awt.Color(237, 236, 233));

	tblTransactions.setModel(new javax.swing.table.DefaultTableModel(
		new Object [][] {
			{null, null, null, null},
		},
		new String [] {
			"Date", "Account", "Description", "Type of Transaction"
		}
	) {
		boolean[] canEdit = new boolean [] {
			false, false, false, false
		};

		public boolean isCellEditable(int rowIndex, int columnIndex) {
			return canEdit [columnIndex];
		}
	});
	jScrollPane2.setViewportView(tblTransactions);

	pnlAllAccHeader1.setBackground(new java.awt.Color(0, 0, 0));
	pnlAllAccHeader1.setPreferredSize(new java.awt.Dimension(655, 68));
	jLabel18.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel18.setForeground(new java.awt.Color(255, 255, 255));
	jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	jLabel18.setText("{ACCOUNT NAME}'S TRANSACTIONS");

	javax.swing.GroupLayout pnlAllAccHeader1Layout = new javax.swing.GroupLayout(pnlAllAccHeader1);
	pnlAllAccHeader1.setLayout(pnlAllAccHeader1Layout);
	pnlAllAccHeader1Layout.setHorizontalGroup(
		pnlAllAccHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(pnlAllAccHeader1Layout.createSequentialGroup()
			.addGap(16, 16, 16)
			.addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);
	pnlAllAccHeader1Layout.setVerticalGroup(
		pnlAllAccHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(pnlAllAccHeader1Layout.createSequentialGroup()
			.addGap(23, 23, 23)
			.addComponent(jLabel18)
			.addContainerGap(23, Short.MAX_VALUE))
	);

	javax.swing.GroupLayout cardMonthLayout = new javax.swing.GroupLayout(cardMonth);
	cardMonth.setLayout(cardMonthLayout);
	cardMonthLayout.setHorizontalGroup(
		cardMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(cardMonthLayout.createSequentialGroup()
			.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(0, 0, Short.MAX_VALUE))
		.addGroup(cardMonthLayout.createSequentialGroup()
			.addComponent(pnlAllAccHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addContainerGap())
	);
	cardMonthLayout.setVerticalGroup(
		cardMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(cardMonthLayout.createSequentialGroup()
			.addComponent(pnlAllAccHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
			.addContainerGap())
	);

	cardViewAllTrans.add(cardMonth, "cardMonth");

	contentPanel.add(cardViewAllTrans, "cardViewAllTrans");

	pnlAddTransHeader.setBackground(new java.awt.Color(0, 0, 0));

	jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel4.setForeground(new java.awt.Color(255, 255, 255));
	jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	jLabel4.setText("ADD TRANSACTION");

	javax.swing.GroupLayout pnlAddTransHeaderLayout = new javax.swing.GroupLayout(pnlAddTransHeader);
	pnlAddTransHeader.setLayout(pnlAddTransHeaderLayout);
	pnlAddTransHeaderLayout.setHorizontalGroup(
		pnlAddTransHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(pnlAddTransHeaderLayout.createSequentialGroup()
			.addGap(16, 16, 16)
			.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);
	pnlAddTransHeaderLayout.setVerticalGroup(
		pnlAddTransHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(pnlAddTransHeaderLayout.createSequentialGroup()
			.addGap(23, 23, 23)
			.addComponent(jLabel4)
			.addContainerGap(23, Short.MAX_VALUE))
	);

	jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel6.setText("AMOUNT:");

	txtFieldAmount.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	txtFieldAmount.setText("0.0");
	txtFieldAmount.addKeyListener(new KeyListener() {
		@Override
		public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD))) {
						e.consume(); // Ignore non-numeric characters
				}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// DI KAILANGAN PERO BAWAL TANGGALIN
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// DI KAILANGAN PERO BAWAL TANGGALIN
		}
});

	jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel8.setText("ACCOUNT:");

	comboAccountList.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

	jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel9.setText("DESCRIPTION:");

	jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel10.setText("DATE:");

	jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel11.setText("TYPE:");

	comboTypeOfTransaction.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	comboTypeOfTransaction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INCOME", "EXPENSE" }));

	btnSaveTransaction.setBackground(new java.awt.Color(0, 0, 0));
	btnSaveTransaction.setForeground(new java.awt.Color(255, 255, 255));
	btnSaveTransaction.setLabel("+ ADD");

	txtFldDescription.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

	Properties p = new Properties();
	p.put("text.today", "Today");
	p.put("text.month", "Month");
	p.put("text.year", "Year");

	UtilDateModel model = new UtilDateModel();
	model.setDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
	model.setSelected(true); 
	JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
	datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

	datePicker.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

	javax.swing.GroupLayout cardAddTransactionLayout = new javax.swing.GroupLayout(cardAddTransaction);
	cardAddTransaction.setLayout(cardAddTransactionLayout);
	cardAddTransactionLayout.setHorizontalGroup(
		cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addComponent(pnlAddTransHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addGroup(cardAddTransactionLayout.createSequentialGroup()
			.addGap(93, 93, 93)
			.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel6)
				.addComponent(jLabel11)
				.addComponent(jLabel9)
				.addComponent(jLabel8)
				.addComponent(jLabel10))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
			.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
				.addGroup(cardAddTransactionLayout.createSequentialGroup()
					.addGap(217, 217, 217)
					.addComponent(btnSaveTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addComponent(comboAccountList, javax.swing.GroupLayout.Alignment.TRAILING, 0, 360, Short.MAX_VALUE)
				.addComponent(txtFieldAmount)
				.addComponent(comboTypeOfTransaction, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(txtFldDescription)
				.addComponent(datePicker))
			.addGap(83, 83, 83))
	);
	cardAddTransactionLayout.setVerticalGroup(
		cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(cardAddTransactionLayout.createSequentialGroup()
			.addComponent(pnlAddTransHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(60, 60, 60)
			.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				.addComponent(comboTypeOfTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jLabel11))
			.addGap(18, 18, 18)
			.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				.addComponent(txtFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jLabel6))
			.addGap(18, 18, 18)
			.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				.addComponent(comboAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jLabel8))
			.addGap(18, 18, 18)
			.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				.addComponent(txtFldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jLabel9))
			.addGap(18, 18, 18)
			.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				.addComponent(jLabel10)
				.addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
			.addComponent(btnSaveTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(65, 65, 65))
	);

	contentPanel.add(cardAddTransaction, "cardAddTransaction");

	tblAccList.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	tblAccList.setModel(new javax.swing.table.DefaultTableModel(
		new Object [][] {
			{null, null},
		},
		new String [] {
			"Accounts", "Balance"
		}
	) {
		boolean[] canEdit = new boolean [] {
			false, false
		};

		public boolean isCellEditable(int rowIndex, int columnIndex) {
			return canEdit [columnIndex];
		}
	});
	jScrollPane1.setViewportView(tblAccList);

	pnlAllAccHeader2.setBackground(new java.awt.Color(0, 0, 0));

	jLabel17.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel17.setForeground(new java.awt.Color(255, 255, 255));
	jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	jLabel17.setText("{ACCOUNT NAME}'S ACCOUNTS");

	btnAddNewAcc.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
	btnAddNewAcc.setLabel("+ ADD NEW ACCOUNT");
	btnAddNewAcc.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			btnAddNewAccActionPerformed(evt);
		}
	});

	javax.swing.GroupLayout pnlAllAccHeader2Layout = new javax.swing.GroupLayout(pnlAllAccHeader2);
	pnlAllAccHeader2.setLayout(pnlAllAccHeader2Layout);
	pnlAllAccHeader2Layout.setHorizontalGroup(
		pnlAllAccHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(pnlAllAccHeader2Layout.createSequentialGroup()
			.addGap(16, 16, 16)
			.addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addComponent(btnAddNewAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(27, 27, 50))
	);
	pnlAllAccHeader2Layout.setVerticalGroup(
		pnlAllAccHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(pnlAllAccHeader2Layout.createSequentialGroup()
			.addGap(18, 18, 18)
			.addGroup(pnlAllAccHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
				.addComponent(btnAddNewAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jLabel17))
			.addContainerGap(23, Short.MAX_VALUE))
	);

	jLabel19.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
	jLabel19.setText("Liabilities");

	jLabel20.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
	jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	jLabel20.setText("0.0");

	jLabel21.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
	jLabel21.setText("Total");

	jLabel22.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
	jLabel22.setText("Assets");

	jLabel23.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
	jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	jLabel23.setText("0.0");

	jLabel24.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
	jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	jLabel24.setText("0.0");


	javax.swing.GroupLayout cardViewAllAccounts1Layout = new javax.swing.GroupLayout(cardViewAllAccounts1);
	cardViewAllAccounts1.setLayout(cardViewAllAccounts1Layout);
	cardViewAllAccounts1Layout.setHorizontalGroup(
		cardViewAllAccounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addComponent(pnlAllAccHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
		.addGroup(cardViewAllAccounts1Layout.createSequentialGroup()
			.addContainerGap()
			.addGroup(cardViewAllAccounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(cardViewAllAccounts1Layout.createSequentialGroup()
					.addGap(48, 48, 48)
					.addComponent(jLabel22)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jLabel19)
					.addGap(156, 156, 156)
					.addComponent(jLabel21)
					.addGap(95, 95, 95))
				.addGroup(cardViewAllAccounts1Layout.createSequentialGroup()
					.addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(88, 88, 88)
					.addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(36, 36, 36))))
		.addGroup(cardViewAllAccounts1Layout.createSequentialGroup()
			.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(0, 0, Short.MAX_VALUE))
	);
	cardViewAllAccounts1Layout.setVerticalGroup(
		cardViewAllAccounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(cardViewAllAccounts1Layout.createSequentialGroup()
			.addComponent(pnlAllAccHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addGroup(cardViewAllAccounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				.addComponent(jLabel19)
				.addComponent(jLabel21)
				.addComponent(jLabel22))
			.addGap(0, 0, 0)
			.addGroup(cardViewAllAccounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(cardViewAllAccounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel20)
					.addComponent(jLabel24))
				.addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(66, 66, 66))
	);

	javax.swing.GroupLayout cardViewAllAccountsLayout = new javax.swing.GroupLayout(cardViewAllAccounts);
	cardViewAllAccounts.setLayout(cardViewAllAccountsLayout);
	cardViewAllAccountsLayout.setHorizontalGroup(
		cardViewAllAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
		.addGroup(cardViewAllAccountsLayout.createSequentialGroup()
			.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(0, 0, Short.MAX_VALUE))
		.addGroup(cardViewAllAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(cardViewAllAccountsLayout.createSequentialGroup()
				.addComponent(cardViewAllAccounts1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(0, 9, Short.MAX_VALUE)))
	);
	cardViewAllAccountsLayout.setVerticalGroup(
		cardViewAllAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(cardViewAllAccountsLayout.createSequentialGroup()
			.addGap(136, 136, 136)
			.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(66, 66, 66))
		.addGroup(cardViewAllAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(cardViewAllAccountsLayout.createSequentialGroup()
				.addComponent(cardViewAllAccounts1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(0, 60, Short.MAX_VALUE)))
	);

	contentPanel.add(cardViewAllAccounts, "cardViewAllAccounts");

	pnlAddAccHeader3.setBackground(new java.awt.Color(0, 0, 0));

	jLabel25.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel25.setForeground(new java.awt.Color(255, 255, 255));
	jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	jLabel25.setText("ADD NEW ACCOUNT");

	javax.swing.GroupLayout pnlAddAccHeader3Layout = new javax.swing.GroupLayout(pnlAddAccHeader3);
	pnlAddAccHeader3.setLayout(pnlAddAccHeader3Layout);
	pnlAddAccHeader3Layout.setHorizontalGroup(
		pnlAddAccHeader3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(pnlAddAccHeader3Layout.createSequentialGroup()
			.addGap(16, 16, 16)
			.addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);
	pnlAddAccHeader3Layout.setVerticalGroup(
		pnlAddAccHeader3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(pnlAddAccHeader3Layout.createSequentialGroup()
			.addGap(23, 23, 23)
			.addComponent(jLabel25)
			.addContainerGap(23, Short.MAX_VALUE))
	);

	jLabel26.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel26.setText("INITIAL BALANCE");

	jTextField2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jTextField2.setText("Account");

	jLabel27.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel27.setText("ACCOUNT NAME:");

	jComboBox3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard Account", "Fixed Deposit Account" }));

	jLabel30.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel30.setText("TYPE:");

	txtBoxInitialBalance.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	txtBoxInitialBalance.setText("0.0");

	btnSaveAccount.setBackground(new java.awt.Color(0, 0, 0));
	btnSaveAccount.setForeground(new java.awt.Color(255, 255, 255));
	btnSaveAccount.setLabel("+ ADD");
	btnSaveAccount.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			btnSaveAccountActionPerformed(evt);
		}
	});

	jLabel31.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
	jLabel31.setText("LOCK ACCOUNT UNTIL:");

	UtilDateModel model2 = new UtilDateModel();
	model2.setDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
	model2.setSelected(true); 
	JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p);
	lockPeriodDatePicker = new JDatePickerImpl(datePanel2, new DateLabelFormatter());
	lockPeriodDatePicker.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

	jLabel3.setText("(Only applicable for a fixed deposit account)");

	lockPeriodDatePicker.setVisible(false);
	jLabel3.setVisible(false);
	jLabel31.setVisible(false);

	javax.swing.GroupLayout cardAddNewAccLayout = new javax.swing.GroupLayout(cardAddNewAcc);
		cardAddNewAcc.setLayout(cardAddNewAccLayout);
		cardAddNewAccLayout.setHorizontalGroup(
			cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addComponent(pnlAddAccHeader3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addGroup(cardAddNewAccLayout.createSequentialGroup()
			.addGap(152, 152, 152)
			.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(cardAddNewAccLayout.createSequentialGroup()
					.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardAddNewAccLayout.createSequentialGroup()
					.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(cardAddNewAccLayout.createSequentialGroup()
							.addComponent(jLabel31)
							.addGap(21, 21, 21)
							.addComponent(lockPeriodDatePicker))
						.addComponent(btnSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(cardAddNewAccLayout.createSequentialGroup()
							.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel26)
								.addComponent(jLabel27)
								.addComponent(jLabel30))
							.addGap(59, 59, 59)
							.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jComboBox3, 0, 201, Short.MAX_VALUE)
								.addComponent(txtBoxInitialBalance)
								.addComponent(jTextField2))))
							.addGap(115, 115, 115))))
			);
			cardAddNewAccLayout.setVerticalGroup(
				cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(cardAddNewAccLayout.createSequentialGroup()
					.addComponent(pnlAddAccHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(54, 54, 54)
					.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(cardAddNewAccLayout.createSequentialGroup()
							.addGap(6, 6, 6)
							.addComponent(jLabel27))
						.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(cardAddNewAccLayout.createSequentialGroup()
							.addGap(6, 6, 6)
							.addComponent(jLabel26))
						.addComponent(txtBoxInitialBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel30)
						.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(35, 35, 35)
					.addComponent(jLabel3)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel31)
						.addComponent(lockPeriodDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
					.addComponent(btnSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(44, 44, 44))
			);
	contentPanel.add(cardAddNewAcc, "cardAddNewAcc");

	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	getContentPane().setLayout(layout);
	layout.setHorizontalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(layout.createSequentialGroup()
			.addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
			.addContainerGap())
		.addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	);
	layout.setVerticalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(layout.createSequentialGroup()
			.addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
	);
}

public JTable getTblTransactions() {
	return tblTransactions;
}

public JComboBox<String> getcomboAccountList() {
	return comboAccountList;
}

private void btnViewAllAccActionPerformed(java.awt.event.ActionEvent evt) {                                              
	CardLayout card = (CardLayout)contentPanel.getLayout();
	card.show(contentPanel, "cardViewAllAccounts");
	btnAddTransaction.setVisible(true);
	btnViewAllAcc.setVisible(false);
	btnViewAllTrans.setVisible(true);
}                                                                                    

private void btnAddTransactionActionPerformed(java.awt.event.ActionEvent evt) {                                                  
	CardLayout card = (CardLayout)contentPanel.getLayout();
	card.show(contentPanel, "cardAddTransaction");
	btnAddTransaction.setVisible(false);
	btnViewAllAcc.setVisible(true);
	btnViewAllTrans.setVisible(true);
}                       

private void btnViewAllTransActionPerformed(java.awt.event.ActionEvent evt) {                                                
	CardLayout card2 = (CardLayout)contentPanel.getLayout();
	CardLayout card = (CardLayout)cardViewAllTrans.getLayout();
	card2.show(contentPanel, "cardViewAllTrans");
	card.show(cardViewAllTrans, "cardMonth");
	btnAddTransaction.setVisible(true);
	btnViewAllAcc.setVisible(true);
	btnViewAllTrans.setVisible(false);
}                                               

public void btnSaveTransactionActionPerformed(java.awt.event.ActionEvent evt) {                                                   
	CardLayout card2 = (CardLayout)contentPanel.getLayout();
	CardLayout card = (CardLayout)cardViewAllTrans.getLayout();
	card2.show(contentPanel, "cardViewAllTrans");
	card.show(cardViewAllTrans, "cardMonth");
	btnAddTransaction.setVisible(true);
	btnViewAllAcc.setVisible(true);
	btnViewAllTrans.setVisible(false);
}

public Transaction getNewTransaction() {
	String accountName = comboAccountList.getSelectedItem().toString();
	String type = comboTypeOfTransaction.getSelectedItem().toString();
	String description = txtFldDescription.getText();
	Double amount = Double.parseDouble(txtFieldAmount.getText());
	
	Date selectedDateUtil = (Date) datePicker.getModel().getValue();

	Instant instant = selectedDateUtil.toInstant();
	ZoneId zoneId = ZoneId.systemDefault();
	LocalDate selectedDate = instant.atZone(zoneId).toLocalDate();

	System.out.println(accountName +'\n'+ selectedDate +'\n'+ amount +'\n'+ type +'\n'+ description);

	return new Transaction(accountName, selectedDate, amount, type, description);

	
}

public Button getBtnSaveTransaction() {
	return btnSaveTransaction;
}

private void btnSaveAccountActionPerformed(java.awt.event.ActionEvent evt) {                                               
	btnViewAllAccActionPerformed(evt);
}                                              

private void btnAddNewAccActionPerformed(java.awt.event.ActionEvent evt) {                                             
	CardLayout card = (CardLayout)contentPanel.getLayout();
	card.show(contentPanel, "cardAddNewAcc");
	btnAddTransaction.setVisible(true);
	btnViewAllAcc.setVisible(true);
	btnViewAllTrans.setVisible(true);
}

	// Variables declaration - do not modify    
	private JDatePickerImpl lockPeriodDatePicker; 
	private JDatePickerImpl datePicker;                
	private java.awt.Button btnAddNewAcc;
	private java.awt.Button btnAddTransaction;
	private java.awt.Button btnLogOut;
	private java.awt.Button btnSaveAccount;
	private java.awt.Button btnSaveTransaction;
	private java.awt.Button btnViewAllAcc;
	private java.awt.Button btnViewAllTrans;
	private javax.swing.JPanel cardAddNewAcc;
	private javax.swing.JPanel cardAddTransaction;
	private javax.swing.JPanel cardMonth;
	private javax.swing.JPanel cardViewAllAccounts;
	private javax.swing.JPanel cardViewAllAccounts1;
	private javax.swing.JPanel cardViewAllTrans;
	private javax.swing.JPanel contentPanel;
	private javax.swing.JTextField txtBoxInitialBalance;
	private javax.swing.JPanel header;
	private javax.swing.JComboBox<String> comboAccountList;
	private javax.swing.JComboBox<String> comboTypeOfTransaction;
	private javax.swing.JComboBox<String> jComboBox3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JTextField txtFieldAmount;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JLabel lblAccName;
	private javax.swing.JLabel lblTotalAccountBalance;
	private javax.swing.JLabel lblYourTrans;
	private javax.swing.JPanel pnlAccName;
	private javax.swing.JPanel pnlAddAccHeader3;
	private javax.swing.JPanel pnlAddTransHeader;
	private javax.swing.JPanel pnlAllAccHeader1;
	private javax.swing.JPanel pnlAllAccHeader2;
	private javax.swing.JPanel sidebar;
	private javax.swing.JTable tblAccList;
	private javax.swing.JTable tblTransPreview;
	private javax.swing.JTable tblTransactions;
	private javax.swing.JTextField txtFldDescription;
// End of variables declaration                   
}
