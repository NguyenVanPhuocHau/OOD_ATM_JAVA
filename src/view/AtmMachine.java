package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Connection;

public class AtmMachine extends JFrame {

	public AtmMachine() {
		initComponents();
		// seticon();
		setListenner();
		setVisible(true);
	}

	private void initComponents() {
		amountWithdraw =0;
		userInteraction = new javax.swing.JPanel();

		screen = new Screen();
		takeAndReceivePart = new TakeAndReceivePart();

		brand = new Brand();

		keyBoard = new KeyBoard();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(204, 204, 255));
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowActivated(java.awt.event.WindowEvent evt) {

			}
		});

		userInteraction.setBackground(new java.awt.Color(51, 51, 51));
		// userInteraction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		userInteraction.setLayout(new BorderLayout());

		userInteraction.add(keyBoard, BorderLayout.SOUTH);

		userInteraction.add(screen, BorderLayout.CENTER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(userInteraction, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(takeAndReceivePart, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addComponent(brand, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(takeAndReceivePart, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(userInteraction, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))));

		pack();
	}

	public void setListenner() {
		takeAndReceivePart.getCardReader().getButtonCard().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("card");
			}
		});
		takeAndReceivePart.getCashDispenser().getButtonCash().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("cash");
			}
		});
		takeAndReceivePart.getReceiptPrinter().getButtonBill().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("bill");
			}
		});

		screen.getLeftButton1().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("left1");

			}
		});
		screen.getLeftButton2().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("left2");

			}
		});
		screen.getLeftButton3().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("left3");

			}
		});
		screen.getLeftButton4().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("left4");

			}
		});
		screen.getRightButton1().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("right1");

			}
		});
		screen.getRightButton2().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("right2");

			}
		});
		screen.getRightButton3().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("right3");

			}
		});
		screen.getRightButton4().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("right4");

			}
		});

		keyBoard.getjButton1().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("button1");

			}
		});
		keyBoard.getjButton2().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("button2");

			}
		});
		keyBoard.getjButton3().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("button3");

			}
		});
		keyBoard.getjButton4().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("button4");

			}
		});
		keyBoard.getjButton5().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("button5");

			}
		});
		keyBoard.getjButton6().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("button6");

			}
		});
		keyBoard.getjButton7().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("button7");

			}
		});
		keyBoard.getjButton8().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("button8");

			}
		});
		keyBoard.getjButton9().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("button9");

			}
		});
		keyBoard.getjButton10().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("button0");

			}
		});
		keyBoard.getCancel().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("cancel");

			}
		});
		keyBoard.getClear().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("clear");

			}
		});
		keyBoard.getEnter().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect.dial("enter");

			}
		});

	}

	public Connection getConnect() {
		return connect;
	}

	public Screen getScreen() {
		return screen;
	}

	public KeyBoard getKeyBoard() {
		return keyBoard;
	}

	public TakeAndReceivePart getTakeAndReceivePart() {
		return takeAndReceivePart;
	}

	public void run(Connection c) {
		connect = c;
	}

	public void setPin(String num) {
		screen.setPin(num);
	}

	public String getPin() {
		return screen.getPin();
	}

	public String getAcountNumberToTranfer() {
		return screen.getAcountNumberToTranfer();
	}

	public void setAcountNumberToTranfer(String num) {
		if (getAcountNumberToTranfer().length() < 15) {
			screen.setAcountNumberToTranfer(num);
		}
	}

	public String getAmountMoneyToTranfer() {
		return screen.getAmountMoneyToTranfer().replace(",","");
	}

	public void setAmountMoneyToTranfer(String num) {

		screen.setAmountMoneyToTranfer(num);

	}
	

	public void setAmountMoneyToWithdraw(String num) {

		screen.setAmountMoneyToWithdraw(num);

	}

	public void clearAmountMoney() {
		screen.clearAmountMoney();
	}

	public void clearFillInfor() {
		screen.clearDataInfor();
	}

	public void createBill(String detail) {
		getTakeAndReceivePart().getReceiptPrinter().getjTextBill().setText(detail);
	}

	public void setMoneyLable1(String text) {
		takeAndReceivePart.setMoneyLable1(text);
	}

	public void setMoneyLable2(String text) {
		takeAndReceivePart.setMoneyLable2(text);
	}

	public void setMoneyLable3(String text) {
		takeAndReceivePart.setMoneyLable3(text);
	}

	public void setAmountWithdraw(int num) {
		amountWithdraw = num;
	}
	public int getAmountWithdraw() {
		return amountWithdraw;
	}
	public void emptyCashDispenser() {
		takeAndReceivePart.emptyCashDispenser();
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private int amountWithdraw;
	private javax.swing.JPanel userInteraction;
	private Connection connect;
	private Screen screen;
	private KeyBoard keyBoard;
	private TakeAndReceivePart takeAndReceivePart;

	private Brand brand;

}
