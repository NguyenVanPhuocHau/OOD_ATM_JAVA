package controller;

import Model.Acount;
import view.AtmMachine;

public class TransactionFactory {
	private AtmMachine atmMachine;
	private Acount currentAcount;
	public TransactionFactory(AtmMachine atm, Acount acount) {
		super();
		this.atmMachine = atm;
		this.currentAcount = acount;
	}
	
	public Transaction getTransaction(String name) {
		switch (name) {
		case "balanceinquiry":
			return new BalanceInquiry(atmMachine, currentAcount);
			
		case "changepin":
			return new ChangePin(atmMachine, currentAcount, atmMachine.getPin());
		
		case "transfermoney":
			int amount = Integer.parseInt(atmMachine.getAmountMoneyToTranfer().replace(",", ""));
			return new TransferMoney(atmMachine, currentAcount, atmMachine.getAcountNumberToTranfer(),amount);
			
		default:
			break;
		}
		return null;
	}
}
