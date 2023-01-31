package view;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;


public class CashDispenser extends JPanel {
	public CashDispenser() {
		initComponents();
	}

	private void initComponents() {
		jSeparator = new JSeparator();
		buttonCash = new JButton();
		for (int i = 0; i < money.length; i++) {
			money[i] = new JLabel();
			money[i].setFont(new java.awt.Font("", 1, 24)); 
			money[i].setHorizontalAlignment(JLabel.CENTER);
		}
		money[0].setIcon(new ImageIcon("500k.jpg"));
		money[1].setText("x0");
		money[3].setText("x0");
		money[5].setText("x0");
		
		money[2].setIcon(new ImageIcon("200k.jpg"));
		money[4].setIcon(new ImageIcon("100k.jpg"));
		this.setBackground(new java.awt.Color(102, 102, 102));
		this.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)),
				"Collect cash Here", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.DEFAULT_POSITION));

		jSeparator.setBackground(new java.awt.Color(0, 0, 0));
		jSeparator.setForeground(new java.awt.Color(0, 0, 0));
		jSeparator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
		 moneyJPanel = new JPanel();
		moneyJPanel.setLayout(new GridLayout(3, 2));
		for (int i = 0; i < money.length; i++) {
			moneyJPanel.add(money[i]);
		}
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(0, 150, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(buttonCash, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										))
						.addComponent(jSeparator)
						.addComponent(moneyJPanel))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(moneyJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(4, 4, 4).addComponent(buttonCash, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)));
		//jSeparator.setVisible(false);
		moneyJPanel.setVisible(false);
	

	}
	
	

	public javax.swing.JSeparator getjSeparator() {
		return jSeparator;
	}

	public JButton getButtonCash() {
		return buttonCash;
	}

	public void setButtonCash(JButton buttonCash) {
		this.buttonCash = buttonCash;
	}

	public JLabel[] getMoney() {
		return money;
	}

	public void setMoney(JLabel[] money) {
		this.money = money;
	}
	
	public void setMoneyLable1(String text) {
		money[1].setText(text);
	}
	public void setMoneyLable2(String text) {
		money[3].setText(text);
	}
	public void setMoneyLable3(String text) {
		money[5].setText(text);
	}
	
	public JPanel getMoneyJPanel() {
		return moneyJPanel;
	}
	public void emptyCashDispenser() {
		money[1].setText("x0");
		money[3].setText("x0");
		money[5].setText("x0");
	}


	private JPanel moneyJPanel;
	private javax.swing.JSeparator jSeparator;
	private JButton buttonCash;
	private JLabel[] money = new JLabel[6];
	

}
