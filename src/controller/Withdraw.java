package controller;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.SwingUtilities;

import Model.Acount;

import view.AtmMachine;

public class Withdraw extends Transaction{
	private int amountWithdraw;
	public Withdraw(AtmMachine atm, Acount acount,int amountWithdraw) {
		super(atm, acount);
		this.amountWithdraw=amountWithdraw;
		fee=1100;
	}
	
	public PaperCurrencyDispenser withdrawal() {
		PaperCurrencyDispenser five = new Paper500k(atm);
		PaperCurrencyDispenser two = new Paper200k(atm);
		PaperCurrencyDispenser one = new Paper100k(atm);
		five.setNextDispenser(two);
		two.setNextDispenser(one);
		return five;
	
	}

	@Override
	public void deploy() {
		if (acount.getAvailableBalance()-amountWithdraw > 50000 && ((amountWithdraw%500000==0) || (amountWithdraw%200000==0) || (amountWithdraw%100000==0))) {
			atm.getScreen().waitDisplay();
			Runnable setTextRun = new Runnable() {
				public void run() {
					try {
						Thread.sleep(2000);
						subtractFee();
						withdrawal().dispense(new PaperCurrency(amountWithdraw));
						acount.setAvailableBalance(acount.getAvailableBalance()-amountWithdraw);
						atm.getScreen().conformWithdrawDisplay(acount.getAvailableBalance());
						atm.getConnect().setAtmState(new WaitForConformWihtdrawState(atm));

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			SwingUtilities.invokeLater(setTextRun);
	
		}
		else {
			atm.getScreen().moneyInvalid();
			Runnable setTextRun = new Runnable() {
				public void run() {
					try {
						Thread.sleep(1500);
						atm.getScreen().enterMoneyDisplay();

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			SwingUtilities.invokeLater(setTextRun);
		}
		
		
	}

	@Override
	public String createBill() {
		Locale localeEN = new Locale("en", "EN");
		NumberFormat en = NumberFormat.getInstance(localeEN);
		String balance = en.format(acount.getAvailableBalance());
		String amountw = en.format(amountWithdraw);
		return "\tRUT TIEN MAT\n\n"
				+ "    So the:\t     "+acount.getNumberOfCard()+"\n"
				+ "    So giao dich:     88888\n\n"
				+ "    Ngay\t     Gio\tMay ATM\n"
				+ "    "+date+"\t     "+time.getHour()+":"+time.getMinute()+"\t8888\n\n"
				+ "    So tai khoan:      "+acount.getNumberOfAcount()+"\n"
				+ "    So tien rut:      "+amountw+" VND\n"
				+ "    So du tai khoan:  "+balance+" VND\n\n"
				+ "    Phi: 1.000 VND     VAT: 100 VND\n"
				+ "    Phi in hoa don:      500 VND\n"
				+ "    VAT in hoa don:     50 VND\n"
				+ "    APP: Debit Mastercard";
	}

}
