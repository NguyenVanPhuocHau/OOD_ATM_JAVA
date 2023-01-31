package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class CardReader extends JPanel {
	public CardReader() {
		initComponents();
	}

	private void initComponents() {
		// JPanel this = new JPanel();
		jSeparator3 = new JSeparator();
		hasCardOrNot = new JLabel();
	
		buttonCard = new JButton();
		jTextCardNumber = new JTextField();
		this.setBackground(new java.awt.Color(102, 102, 102));
		this.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)), "CARD",
				javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

		jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
		jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
		jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

		hasCardOrNot.setBackground(new java.awt.Color(0, 0, 0));
		hasCardOrNot.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(0, 0, 0)));
		hasCardOrNot.setHorizontalAlignment(JLabel.CENTER);
		hasCardOrNot.setForeground(Color.RED);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(0, 219, Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(buttonCard, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(hasCardOrNot, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addComponent(jTextCardNumber))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup()
						.addComponent(hasCardOrNot, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(4, 4, 4).addComponent(buttonCard, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)));
		// this.add(this);
		hasCardOrNot.setText("Chư có thẻ");

	}
	
	

	public void setHasCardOrNot(String state) {
		hasCardOrNot.setText(state);
	}

	public javax.swing.JSeparator getjSeparator3() {
		return jSeparator3;
	}

	public javax.swing.JLabel getHasCardOrNot() {
		return hasCardOrNot;
	}

	public JTextField getjTextCardNumber() {
		return jTextCardNumber;
	}
	
	public void noCard() {
		jTextCardNumber.setText("");
	}

	public JButton getButtonCard() {
		return buttonCard;
	}
	
	public String getAcountNumber() {
		return jTextCardNumber.getText();
	}
	




	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JLabel hasCardOrNot;

	private JTextField jTextCardNumber;
	private JButton buttonCard;

}
