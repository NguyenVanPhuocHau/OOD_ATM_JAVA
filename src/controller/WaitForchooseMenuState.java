package controller;

import Model.Acount;
import view.AtmMachine;

public class WaitForchooseMenuState extends AtmState{
	Acount currentAcount = atm.getConnect().getCurrentAcount();
	public WaitForchooseMenuState(AtmMachine atm) {
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
		atm.getScreen().chooseMoneyDisplay();
		atm.getConnect().setAtmState(new WaitForchooseMoneyState(atm));
		
	}

	@Override
	public void clickLeft2Button() {
		atm.getScreen().tranferMoneyStep1Display();
		atm.getConnect().setAtmState(new WaitForEnterAcountNumberToTransferState(atm));
		
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
		atm.getScreen().changePinStep1Display();
		atm.getConnect().setAtmState(new WaitForChangePinStep1State(atm));
	}

	@Override
	public void clickRight2Button() {
		atm.getConnect().createTransaction("balanceinquiry");
		atm.getConnect().getCurrentTransaction().deploy();
		atm.getScreen().banlanceInquiryDisplay(currentAcount.getAvailableBalance());
		atm.getConnect().setAtmState(new WaitforTalkBillOrNotState(atm));
		
		
	}

	@Override
	public void clickRight3Button() {
	
		
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
