package controller;

import java.text.NumberFormat;
import java.util.Locale;

import Model.Acount;
import view.AtmMachine;

public class BalanceInquiry extends Transaction{

	public BalanceInquiry(AtmMachine atm, Acount acount) {
		super(atm, acount);
		fee = 0;
	}

	@Override
	public void deploy() {
		subtractFee();	
	}
	
	public String createBill() {
		Locale localeEN = new Locale("en", "EN");
		NumberFormat en = NumberFormat.getInstance(localeEN);
		String balance = en.format(acount.getAvailableBalance());
		return "\tVAN TIN SO DU\n\n"
				+ "    So the:\t     "+acount.getNumberOfCard()+"\n"
				+ "    So giao dich:     88888\n\n"
				+ "    Ngay\t     Gio\tMay ATM\n"
				+ "    "+date+"\t     "+time.getHour()+":"+time.getMinute()+"\t8888\n\n"
				+ "    So tai khoan:      "+acount.getNumberOfAcount()+"\n"
				+ "    So du tai khoan:  "+balance+" VND\n\n"
				+ "    Phi: 0 VND     VAT: 0 VND\n"
				+ "    Phi in hoa don:      500 VND\n"
				+ "    VAT in hoa don:     50 VND\n"
				+ "    APP: Debit Mastercard";
		
	}

}
