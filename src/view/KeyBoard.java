package view;
import java.awt.BorderLayout;

import javax.swing.JPanel;

public class KeyBoard extends JPanel{
	
	public KeyBoard() {
		initComponents();
	}
	
	private void initComponents() {
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		JPanel keyBoard = new JPanel();
		
		cancel = new javax.swing.JButton();
		enter = new javax.swing.JButton();
		clear = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		setBackground(new java.awt.Color(51, 51, 51));
		keyBoard.setLayout(new BorderLayout());
		JPanel numberPanel = new JPanel();
		numberPanel.setBackground(new java.awt.Color(51, 51, 51));
		numberPanel.setBorder(
				javax.swing.BorderFactory.createMatteBorder(21, 8, -10, 8, new java.awt.Color(204, 204, 255)));

		jButton1.setText("1");

		jButton2.setText("2");

		jButton3.setText("3");

		jButton4.setText("4");

		jButton5.setText("5");

		jButton6.setText("6");

		jButton7.setText("7");

		jButton8.setText("8");

		jButton9.setText("9");

		jButton10.setText("0");

		javax.swing.GroupLayout numberPanelLayout = new javax.swing.GroupLayout(numberPanel);
		numberPanel.setLayout(numberPanelLayout);
		numberPanelLayout.setHorizontalGroup(numberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(numberPanelLayout.createSequentialGroup().addContainerGap().addGroup(numberPanelLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(numberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(numberPanelLayout.createSequentialGroup()
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(48, 48, 48).addComponent(jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(numberPanelLayout.createSequentialGroup()
										.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(numberPanelLayout.createSequentialGroup()
										.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
						.addGroup(numberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)));
		numberPanelLayout.setVerticalGroup(numberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(numberPanelLayout.createSequentialGroup().addContainerGap()
						.addGroup(numberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(numberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(numberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		keyBoard.add(numberPanel, BorderLayout.WEST);
		JPanel numberControlPanel = new JPanel();
		numberControlPanel.setBackground(new java.awt.Color(51, 51, 51));
		numberControlPanel.setBorder(
				javax.swing.BorderFactory.createMatteBorder(21, 8, -10, 8, new java.awt.Color(204, 204, 204)));

		cancel.setBackground(new java.awt.Color(255, 0, 0));
		cancel.setText("CANCEL");

		enter.setBackground(new java.awt.Color(0, 153, 153));
		enter.setForeground(new java.awt.Color(255, 255, 255));
		enter.setText("ENTER");

		clear.setBackground(new java.awt.Color(204, 204, 0));
		clear.setText("CLEAR");

		jButton14.setBackground(new java.awt.Color(102, 255, 255));
		jButton14.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
		jButton14.setForeground(new java.awt.Color(0, 0, 204));
		jButton14.setText("!");
		

		javax.swing.GroupLayout numberControlPanelLayout = new javax.swing.GroupLayout(numberControlPanel);
		numberControlPanel.setLayout(numberControlPanelLayout);
		numberControlPanelLayout.setHorizontalGroup(numberControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(numberControlPanelLayout.createSequentialGroup().addGap(14, 14, 14).addGroup(numberControlPanelLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(numberControlPanelLayout.createSequentialGroup().addGap(6, 6, 6).addComponent(jButton14,
								javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(16, Short.MAX_VALUE)));
		numberControlPanelLayout
				.setVerticalGroup(
						numberControlPanelLayout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(numberControlPanelLayout.createSequentialGroup().addContainerGap()
										.addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(21, Short.MAX_VALUE)));
		keyBoard.add(numberControlPanel, BorderLayout.EAST);
		this.add(keyBoard);
		
	}
	
	
	
	public javax.swing.JButton getjButton1() {
		return jButton1;
	}

	public javax.swing.JButton getjButton10() {
		return jButton10;
	}

	public javax.swing.JButton getjButton14() {
		return jButton14;
	}

	public javax.swing.JButton getjButton2() {
		return jButton2;
	}

	public javax.swing.JButton getjButton3() {
		return jButton3;
	}

	public javax.swing.JButton getjButton4() {
		return jButton4;
	}

	public javax.swing.JButton getjButton5() {
		return jButton5;
	}

	public javax.swing.JButton getjButton6() {
		return jButton6;
	}

	public javax.swing.JButton getjButton7() {
		return jButton7;
	}

	public javax.swing.JButton getjButton8() {
		return jButton8;
	}

	public javax.swing.JButton getjButton9() {
		return jButton9;
	}

	public javax.swing.JButton getCancel() {
		return cancel;
	}

	public javax.swing.JButton getClear() {
		return clear;
	}

	public javax.swing.JButton getEnter() {
		return enter;
	}



	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;

	private javax.swing.JButton cancel;
	private javax.swing.JButton clear;
	private javax.swing.JButton enter;

}
