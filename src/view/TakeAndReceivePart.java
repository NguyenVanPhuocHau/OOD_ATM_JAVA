package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class TakeAndReceivePart extends JPanel {

	public TakeAndReceivePart() {
		initComponents();
	}

	private void initComponents() {
		takeAndRecivePart = new JPanel();
		receiptPrinter = new ReceiptPrinter();
		cardReader = new CardReader();
		cashDispenser = new CashDispenser();

		takeAndRecivePart.setBackground(new java.awt.Color(51, 51, 51));
		this.setBackground(new java.awt.Color(51, 51, 51));

		javax.swing.GroupLayout takeAndRecivePartLayout = new javax.swing.GroupLayout(takeAndRecivePart);
		takeAndRecivePart.setLayout(takeAndRecivePartLayout);
		takeAndRecivePartLayout.setHorizontalGroup(takeAndRecivePartLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						takeAndRecivePartLayout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(
								cardReader, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, takeAndRecivePartLayout.createSequentialGroup()
						.addContainerGap(5, Short.MAX_VALUE)
						.addGroup(takeAndRecivePartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(cashDispenser, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(receiptPrinter, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		takeAndRecivePartLayout
				.setVerticalGroup(takeAndRecivePartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(takeAndRecivePartLayout.createSequentialGroup()
								.addComponent(receiptPrinter, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(5, 5, 5)
								.addComponent(cardReader, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(5, 5, 5)
								.addComponent(cashDispenser, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		this.add(takeAndRecivePart);

	}
	
	

	public ReceiptPrinter getReceiptPrinter() {
		return receiptPrinter;
	}

	public CardReader getCardReader() {
		return cardReader;
	}

	public CashDispenser getCashDispenser() {
		return cashDispenser;
	}
	
	public String getAcountNumber() {
		return getCardReader().getAcountNumber();
	}
	
	public void setHasOrNotCard(String state) {
		getCardReader().setHasCardOrNot(state);
	}
	
	public void setMoneyLable1(String text) {
		cashDispenser.setMoneyLable1(text);
	}
	public void setMoneyLable2(String text) {
		cashDispenser.setMoneyLable2(text);
	}
	public void setMoneyLable3(String text) {
		cashDispenser.setMoneyLable3(text);
	}
	
	public void emptyCashDispenser() {
		cashDispenser.emptyCashDispenser();
	}



	private javax.swing.JPanel takeAndRecivePart;
	private ReceiptPrinter receiptPrinter;
	private CardReader cardReader;
	private CashDispenser cashDispenser;

}
