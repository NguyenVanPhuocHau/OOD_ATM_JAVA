package controller;

import javax.swing.SwingUtilities;

import Model.Acount;
import view.AtmMachine;

public class WaitForEnterPinState extends AtmState {
	int n = 0;

	public WaitForEnterPinState(AtmMachine atm) {
		super(atm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clickEnterButton() {
		Acount currentAcount = atm.getConnect().getCurrentAcount();
		String pin = atm.getPin();
		if (pin.length() != 6) {
			atm.getScreen().wrongLenghtPinDisplay();
			Runnable setTextRun = new Runnable() {
				public void run() {
					try {
						Thread.sleep(2000);
						atm.getScreen().pinDisplay();

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			SwingUtilities.invokeLater(setTextRun);
		} else {
			if (currentAcount.isLock()) {
				atm.getScreen().lockDisplay();
				Runnable setTextRun = new Runnable() {
					public void run() {
						try {
							Thread.sleep(3000);
							atm.getTakeAndReceivePart().getCardReader().getButtonCard().setEnabled(true);
							atm.getTakeAndReceivePart().getCardReader().getjTextCardNumber().setEnabled(true);
							atm.getTakeAndReceivePart().setHasOrNotCard("Lấy thẻ ra");
							atm.getScreen().ejectCarddisplay();
							atm.getConnect().setAtmState(new WaitForEjectCardState(atm));
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				};
				SwingUtilities.invokeLater(setTextRun);

			} else {
				if (currentAcount.checkPin(pin)) {
					atm.getScreen().waitDisplay();
					Runnable setTextRun = new Runnable() {
						public void run() {
							try {
								Thread.sleep(2000);
								atm.getScreen().feeDisplay();
								atm.getConnect().setAtmState(new WaitForConformFeeState(atm));
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					};
					SwingUtilities.invokeLater(setTextRun);
				} else {
					n++;
					atm.getScreen().wrongPinDisplay();
					Runnable setTextRun = new Runnable() {
						public void run() {
							try {
								Thread.sleep(2000);
								atm.getScreen().pinDisplay();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					};
					SwingUtilities.invokeLater(setTextRun);
					if (n == 3) {
						currentAcount.lock();
					}

				}

			}
		}

	}

	@Override
	public void clickClearButton() {
		String num = atm.getPin();
		if (num.length() > 0) {
			String numAferClear = num.substring(0, num.length() - 1);
			atm.setPin(numAferClear);
		}

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
