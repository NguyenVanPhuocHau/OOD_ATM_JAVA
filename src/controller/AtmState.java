package controller;

import view.AtmMachine;

public abstract class AtmState {
	protected AtmMachine atm;

	public AtmState(AtmMachine atm) {
		super();
		this.atm = atm;
	}
	
	public void clickCancelButton() {
		atm.getTakeAndReceivePart().getCardReader().getButtonCard().setEnabled(true);
		atm.getTakeAndReceivePart().getCardReader().getjTextCardNumber().setEnabled(true);
		atm.getTakeAndReceivePart().setHasOrNotCard("Lấy thẻ ra");
		atm.getScreen().ejectCarddisplay();
		atm.getConnect().setAtmState(new WaitForEjectCardState(atm));
	}
	
	public abstract void clickEnterButton();
	public abstract void clickClearButton();
	public abstract void clickSersionButton();
	public abstract void clickBillButton();
	public abstract void clickCardButton();
	public abstract void clickCashButton();
	public abstract void clickLeft1Button();
	public abstract void clickLeft2Button();
	public abstract void clickLeft3Button();
	public abstract void clickLeft4Button();
	public abstract void clickRight1Button();
	public abstract void clickRight2Button();
	public abstract void clickRight3Button();
	public abstract void clickRight4Button();
	public abstract void clickButton1();
	public abstract void clickButton2();
	public abstract void clickButton3();
	public abstract void clickButton4();
	public abstract void clickButton5();
	public abstract void clickButton6();
	public abstract void clickButton7();
	public abstract void clickButton8();
	public abstract void clickButton9();
	public abstract void clickButton0();

}
