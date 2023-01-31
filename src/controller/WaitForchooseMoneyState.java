package controller;

import view.AtmMachine;

public class WaitForchooseMoneyState extends AtmState {

	public WaitForchooseMoneyState(AtmMachine atm) {
		super(atm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clickEnterButton() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickClearButton() {
		// TODO Auto-generated method stub

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
		atm.setAmountWithdraw(100000);

		atm.getConnect().createTransaction("withdraw");
		atm.getConnect().getCurrentTransaction().deploy();

	}

	@Override
	public void clickLeft2Button() {
		atm.setAmountWithdraw(500000);

		atm.getConnect().createTransaction("withdraw");
		atm.getConnect().getCurrentTransaction().deploy();


	}

	@Override
	public void clickLeft3Button() {
		atm.setAmountWithdraw(1000000);

		atm.getConnect().createTransaction("withdraw");
		atm.getConnect().getCurrentTransaction().deploy();

	}

	@Override
	public void clickLeft4Button() {
		atm.setAmountWithdraw(1500000);

		atm.getConnect().createTransaction("withdraw");
		atm.getConnect().getCurrentTransaction().deploy();


	}

	@Override
	public void clickRight1Button() {
		atm.setAmountWithdraw(2000000);

		atm.getConnect().createTransaction("withdraw");
		atm.getConnect().getCurrentTransaction().deploy();


	}

	@Override
	public void clickRight2Button() {
		

	}

	@Override
	public void clickRight3Button() {
		atm.getScreen().enterMoneyDisplay();
		atm.getConnect().setAtmState(new WaitForEnterMoneyState(atm));

	}

	@Override
	public void clickRight4Button() {
		atm.getTakeAndReceivePart().getCardReader().getButtonCard().setEnabled(true);
		atm.getTakeAndReceivePart().getCardReader().getjTextCardNumber().setEnabled(true);
		atm.getTakeAndReceivePart().setHasOrNotCard("Lấy thẻ ra");
		atm.getScreen().ejectCarddisplay();
		atm.getConnect().setAtmState(new WaitForEjectCardState(atm));

	}

	@Override
	public void clickButton1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton5() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton6() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton7() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton8() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton9() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickButton0() {
		// TODO Auto-generated method stub

	}

}
