package controller;

import javax.swing.SwingUtilities;

import view.AtmMachine;

public class WaitForChangePinStep1State extends AtmState {

	public WaitForChangePinStep1State(AtmMachine atm) {
		super(atm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clickEnterButton() {
		String pin = atm.getPin();
		if (pin.length() != 6) {
			atm.getScreen().wrongLenghtPinDisplay();
			Runnable setTextRun = new Runnable() {
				public void run() {
					try {
						Thread.sleep(2000);
						atm.getScreen().changePinStep1Display();

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			SwingUtilities.invokeLater(setTextRun);
		}
		else {
			atm.getConnect().createTransaction("changepin");
			atm.getScreen().changePinStep2Display();
			atm.getConnect().setAtmState(new WaitForChangePinStep2State(atm));
		}

	}

	@Override
	public void clickClearButton() {
		atm.setPin("");

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
		String num = atm.getPin() + "1";
		atm.setPin(num);

	}

	@Override
	public void clickButton2() {
		String num = atm.getPin() + "2";
		atm.setPin(num);

	}

	@Override
	public void clickButton3() {
		String num = atm.getPin() + "3";
		atm.setPin(num);

	}

	@Override
	public void clickButton4() {
		String num = atm.getPin() + "4";
		atm.setPin(num);

	}

	@Override
	public void clickButton5() {
		String num = atm.getPin() + "5";
		atm.setPin(num);

	}

	@Override
	public void clickButton6() {
		String num = atm.getPin() + "6";
		atm.setPin(num);

	}

	@Override
	public void clickButton7() {
		String num = atm.getPin() + "7";
		atm.setPin(num);

	}

	@Override
	public void clickButton8() {
		String num = atm.getPin() + "8";
		atm.setPin(num);

	}

	@Override
	public void clickButton9() {
		String num = atm.getPin() + "9";
		atm.setPin(num);

	}

	@Override
	public void clickButton0() {
		String num = atm.getPin() + "0";
		atm.setPin(num);

	}

}
