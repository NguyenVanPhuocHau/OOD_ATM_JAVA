package controller;

import view.AtmMachine;

public class WaitForConformFeeState extends AtmState{

	public WaitForConformFeeState(AtmMachine atm) {
		super(atm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clickEnterButton() {
		atm.getScreen().menuDisplay();
		atm.getConnect().setAtmState(new WaitForchooseMenuState(atm));
		
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
