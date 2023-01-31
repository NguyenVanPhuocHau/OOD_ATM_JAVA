package controller;

import view.AtmMachine;

public class WaitForEnterMoneyState extends AtmState{

	public WaitForEnterMoneyState(AtmMachine atm) {
		super(atm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clickEnterButton() {
		int amountWithdraw=Integer.parseInt(atm.getAmountMoneyToTranfer());
		atm.setAmountWithdraw(amountWithdraw);
		atm.getConnect().createTransaction("withdraw");
		atm.getConnect().getCurrentTransaction().deploy();
		
	}

	@Override
	public void clickClearButton() {
	
		atm.clearAmountMoney();
		
		
	}

	@Override
	public void clickSersionButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickBillButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickCardButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickCashButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickLeft1Button() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickLeft2Button() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickLeft3Button() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickLeft4Button() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickRight1Button() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickRight2Button() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickRight3Button() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickRight4Button() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickButton1() {
		String num = atm.getAmountMoneyToTranfer() + "1";
		atm.setAmountMoneyToWithdraw(num);

	}

	@Override
	public void clickButton2() {
		String num = atm.getAmountMoneyToTranfer() + "2";
		atm.setAmountMoneyToWithdraw(num);

	}

	@Override
	public void clickButton3() {
		String num = atm.getAmountMoneyToTranfer() + "3";
		atm.setAmountMoneyToWithdraw(num);

	}

	@Override
	public void clickButton4() {
		String num = atm.getAmountMoneyToTranfer() + "4";
		atm.setAmountMoneyToWithdraw(num);

	}

	@Override
	public void clickButton5() {
		String num = atm.getAmountMoneyToTranfer() + "5";
		atm.setAmountMoneyToWithdraw(num);

	}

	@Override
	public void clickButton6() {
		String num = atm.getAmountMoneyToTranfer() + "6";
		atm.setAmountMoneyToWithdraw(num);

	}

	@Override
	public void clickButton7() {
		String num = atm.getAmountMoneyToTranfer() + "7";
		atm.setAmountMoneyToWithdraw(num);

	}

	@Override
	public void clickButton8() {
		String num = atm.getAmountMoneyToTranfer() + "8";
		atm.setAmountMoneyToWithdraw(num);

	}

	@Override
	public void clickButton9() {
		String num = atm.getAmountMoneyToTranfer() + "9";
		atm.setAmountMoneyToWithdraw(num);

	}

	@Override
	public void clickButton0() {
		String num = atm.getAmountMoneyToTranfer() + "0";
		atm.setAmountMoneyToWithdraw(num);

	}

}
