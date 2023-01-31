package view;

import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class ReceiptPrinter extends JPanel{
	public ReceiptPrinter() {
		initComponents();
	}
	
	private void initComponents() {
		jSeparator = new JSeparator();
		jTextBill = new JTextArea();
		buttonBill = new JButton();
		this.setBackground(new java.awt.Color(102, 102, 102));
		this.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)), "Receipt",
				javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

		jSeparator.setBackground(new java.awt.Color(0, 0, 0));
		jSeparator.setForeground(new java.awt.Color(0, 0, 0));
		jSeparator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(0, 219, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(buttonBill, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addComponent(jSeparator)
						.addComponent(jTextBill))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jTextBill, javax.swing.GroupLayout.PREFERRED_SIZE, 290,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(4, 4, 4).addComponent(buttonBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)));
	
		jTextBill.setVisible(false);
		jTextBill.setFont(new java.awt.Font("sansserif", 0, 13));
		LocalDate date = java.time.LocalDate.now();
		LocalTime time = LocalTime.now();
		
//		jTextBill.setText("                GIAO DICH CHUYEN TIEN\n\n"
//				+ "    So the:\t     111 XXX XXX 111\n"
//				+ "    So giao dich:     88888\n"
//				+ "    Ngay\t     Gio\tMay ATM\n"
//				+ "    "+date+"\t     "+time.getHour()+":"+time.getMinute()+"\t8888\n"
//				+ "    So TK nguon:   123456789090701\n"
//				+ "    So TK dich:      123456789090701\n"
//				+ "    Ten TK dich:     NGUYEN VAN PHUOC HAU\n"
//				+ "    So tien chuyen:  10,000,000 VND\n"
//				+ "    So du tai khoan: 10,000,000 VND\n\n"
//				+ "    Phi: 3.000 VND     VAT: 300 VND\n"
//				+ "    Phi in hoa don:      500 VND\n"
//				+ "    VAT in hoa don:     50 VND\n"
//				+ "    APP: Debit Mastercard");

		
	}
	
	
	public javax.swing.JSeparator getjSeparator() {
		return jSeparator;
	}

	public void setjSeparator(javax.swing.JSeparator jSeparator) {
		this.jSeparator = jSeparator;
	}

	public JTextArea getjTextBill() {
		return jTextBill;
	}

	public void setjTextBill(JTextArea jTextBill) {
		this.jTextBill = jTextBill;
	}

	public JButton getButtonBill() {
		return buttonBill;
	}

	public void setButtonBill(JButton buttonBill) {
		this.buttonBill = buttonBill;
	}


	private javax.swing.JSeparator jSeparator;
	private JTextArea jTextBill;
	private JButton buttonBill;


}
