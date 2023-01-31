package controller;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.SwingUtilities;

import Model.Acount;
import view.AtmMachine;

public class TransferMoney extends Transaction {
	private String acountNumberReciveMoney;
	private int amountMoney;

	public TransferMoney(AtmMachine atm, Acount acount, String acountNumberReciveMoney, int amountMoney) {
		super(atm, acount);
		this.acountNumberReciveMoney = acountNumberReciveMoney;
		this.amountMoney = amountMoney;
		fee = 3300;
	}

	@Override
	public void deploy() {
		Acount acountTo = atm.getConnect().getData().findAcount(acountNumberReciveMoney);
		if (acountTo !=null && (acount.getAvailableBalance()-amountMoney > 50000)) {
			atm.getScreen().waitDisplay();
			acount.setAvailableBalance(acount.getAvailableBalance()-amountMoney);
			acountTo.setAvailableBalance(acountTo.getAvailableBalance()+amountMoney);
			subtractFee();
			Runnable setTextRun = new Runnable() {
				public void run() {
					try {
						Thread.sleep(2000);
						atm.getScreen().transferMoneySuccessDisplay();
						
						Runnable setTextRun = new Runnable() {
							public void run() {
								try {
									Thread.sleep(1300);
									atm.getScreen().takeBillOrNotDisplay();
									atm.getConnect().setAtmState(new WaitforTalkBillOrNotState(atm));
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
							
						};
						SwingUtilities.invokeLater(setTextRun);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			};
			SwingUtilities.invokeLater(setTextRun);
		}
		else {
			atm.getScreen().waitDisplay();
			Runnable setTextRun = new Runnable() {
				public void run() {
					try {
						Thread.sleep(2000);
						atm.getScreen().transferMoneyNotSuccessDisplay();
						
						Runnable setTextRun = new Runnable() {
							public void run() {
								try {
									Thread.sleep(1300);
									atm.getScreen().continueDisplay();
									atm.getConnect().setAtmState(new WaitForContinueOrNotState(atm));
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
							
						};
						SwingUtilities.invokeLater(setTextRun);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			};
			SwingUtilities.invokeLater(setTextRun);	
		}
		atm.clearFillInfor();

	}

	@Override
	public String createBill() {
		Acount acountTo = atm.getConnect().getData().findAcount(acountNumberReciveMoney);
		String name = "";
		if (acountTo !=null) {
			name = acountTo.getName();
		}
		else {
			name = "?";
		}
		Locale localeEN = new Locale("en", "EN");
		NumberFormat en = NumberFormat.getInstance(localeEN);
		String balance = en.format(acount.getAvailableBalance());
		return "                GIAO DICH CHUYEN TIEN\n\n"
		+ "    So the:\t     111 XXX XXX 111\n"
		+ "    So giao dich:     88888\n\n"
		+ "    Ngay\t     Gio\tMay ATM\n"
		+ "    "+date+"\t     "+time.getHour()+":"+time.getMinute()+"\t8888\n"
		+ "    So TK nguon:   "+acount.getNumberOfAcount()+"\n"
		+ "    So TK dich:      "+acountNumberReciveMoney+"\n"
		+ "    Ten TK dich:     "+name+"\n"
		+ "    So tien chuyen:  "+atm.getAmountMoneyToTranfer()+" VND\n"
		+ "    So du tai khoan: "+balance+" VND\n\n"
		+ "    Phi: 3.000 VND     VAT: 300 VND\n"
		+ "    Phi in hoa don:      500 VND\n"
		+ "    VAT in hoa don:     50 VND\n"
		+ "    APP: Debit Mastercard";
		
	}

}
