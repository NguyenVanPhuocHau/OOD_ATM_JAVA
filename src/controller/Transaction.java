package controller;

import java.time.LocalDate;
import java.time.LocalTime;

import Model.Acount;
import view.AtmMachine;

public abstract class Transaction {
	protected AtmMachine atm;
	protected Acount acount;
	protected int fee;
	protected LocalDate date = java.time.LocalDate.now();
	protected LocalTime time = LocalTime.now();
	public Transaction(AtmMachine atm, Acount acount) {
		super();
		this.atm = atm;
		this.acount = acount;
	}
	 
	public abstract void deploy();
	public abstract String createBill();
	public void subtractFee() {
		int balance = acount.getAvailableBalance()-fee;
		acount.setAvailableBalance(balance);
	}
	public void subtractBillFee() {
		int balance = acount.getAvailableBalance()-550;
		acount.setAvailableBalance(balance);
	}
	
	

}
