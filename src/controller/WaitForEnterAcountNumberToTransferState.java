package controller;

import javax.swing.SwingUtilities;

import view.AtmMachine;

public class WaitForEnterAcountNumberToTransferState extends AtmState{

	public WaitForEnterAcountNumberToTransferState(AtmMachine atm) {
		super(atm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clickEnterButton() {
		if (atm.getAcountNumberToTranfer().length() !=15) {
			atm.getScreen().lenghtOfAcountWrong();
			Runnable setTextRun = new Runnable() {
				public void run() {
					try {
						Thread.sleep(2000);
						
						atm.getScreen().tranferMoneyStep1Display();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			SwingUtilities.invokeLater(setTextRun);
			
		}
		else {
			atm.getScreen().tranferMoneyStep2Display();
			atm.getConnect().setAtmState(new WaitForEnterAmountMoneyToTransfer(atm));
			
		}
		
	}

	@Override
	public void clickClearButton() {
		String num = atm.getAcountNumberToTranfer();
		if (num.length() > 0) {
			String numAferClear = num.substring(0, num.length() - 1);
			atm.setAcountNumberToTranfer(numAferClear);
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
		String num = atm.getAcountNumberToTranfer() + "1";
		atm.setAcountNumberToTranfer(num);

	}

	@Override
	public void clickButton2() {
		String num = atm.getAcountNumberToTranfer() + "2";
		atm.setAcountNumberToTranfer(num);

	}

	@Override
	public void clickButton3() {
		String num = atm.getAcountNumberToTranfer() + "3";
		atm.setAcountNumberToTranfer(num);

	}

	@Override
	public void clickButton4() {
		String num = atm.getAcountNumberToTranfer() + "4";
		atm.setAcountNumberToTranfer(num);

	}

	@Override
	public void clickButton5() {
		String num = atm.getAcountNumberToTranfer() + "5";
		atm.setAcountNumberToTranfer(num);

	}

	@Override
	public void clickButton6() {
		String num = atm.getAcountNumberToTranfer() + "6";
		atm.setAcountNumberToTranfer(num);

	}

	@Override
	public void clickButton7() {
		String num = atm.getAcountNumberToTranfer() + "7";
		atm.setAcountNumberToTranfer(num);

	}

	@Override
	public void clickButton8() {
		String num = atm.getAcountNumberToTranfer() + "8";
		atm.setAcountNumberToTranfer(num);

	}

	@Override
	public void clickButton9() {
		String num = atm.getAcountNumberToTranfer() + "9";
		atm.setAcountNumberToTranfer(num);

	}

	@Override
	public void clickButton0() {
		String num = atm.getAcountNumberToTranfer() + "0";
		atm.setAcountNumberToTranfer(num);

	}

}
