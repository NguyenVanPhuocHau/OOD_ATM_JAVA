package controller;

import javax.swing.SwingUtilities;

import Model.Acount;
import view.AtmMachine;

public class ChangePin extends Transaction{
	private String newPin;
	public ChangePin(AtmMachine atm, Acount acount,String newPin) {
		super(atm, acount);
		this.newPin = newPin;
		fee=0;
	}

	@Override
	public void deploy() {
		
		if (atm.getPin().equals(newPin)) {
			subtractFee();
			acount.setPin(newPin);
			atm.getScreen().changePinSuccessDisplay();
			Runnable setTextRun = new Runnable() {
				public void run() {
					try {
						Thread.sleep(2000);
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
		}
		else {
			atm.getScreen().wrongConformPinDisplay();
			Runnable setTextRun = new Runnable() {
				public void run() {
					try {
						Thread.sleep(2000);
						atm.getScreen().changePinStep2Display();

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			SwingUtilities.invokeLater(setTextRun);
		}
		
	}

	@Override
	public String createBill() {
		// TODO Auto-generated method stub
		return null;
	}

}
