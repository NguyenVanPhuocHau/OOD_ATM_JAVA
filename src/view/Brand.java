package view;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Brand extends JPanel{
	public Brand() {
		initComponents();
	}
	
	private void initComponents() {
		logo = new javax.swing.JLabel();
		nameOfBank = new javax.swing.JLabel();
		this.setBackground(new java.awt.Color(153, 153, 255));

		logo.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
		logo.setForeground(new java.awt.Color(255, 255, 255));
		logo.setIcon(new ImageIcon("ATM.png")); // NOI18N
		logo.setText("NLU");

		nameOfBank.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		nameOfBank.setText("BANK");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(22, 22, 22).addComponent(logo)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(nameOfBank, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(24, 24, 24)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(nameOfBank, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(32, Short.MAX_VALUE)));

		layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] { logo, nameOfBank });

	}
	private javax.swing.JLabel logo;

	private javax.swing.JLabel nameOfBank;

}
