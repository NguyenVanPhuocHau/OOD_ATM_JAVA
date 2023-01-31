package controller;

import javax.swing.SwingUtilities;

import Model.Acount;
import view.AtmMachine;

public class WaitForEnterAmountMoneyToTransfer extends AtmState{

	public WaitForEnterAmountMoneyToTransfer(AtmMachine atm) {
		super(atm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clickEnterButton() {
		if (atm.getAmountMoneyToTranfer().equals("")) {
			atm.getScreen().amountMoneyInvalid();
			
			Runnable setTextRun = new Runnable() {
				public void run() {
					try {
						Thread.sleep(1300);
						atm.getScreen().tranferMoneyStep2Display();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			};
			SwingUtilities.invokeLater(setTextRun);
		}
		else {
			Acount acountTo = atm.getConnect().getData().findAcount(atm.getAcountNumberToTranfer());
			String name = "";
			if (acountTo !=null) {
				name = acountTo.getName();
			}
			else {
				name = "?";
			}
			atm.getConnect().createTransaction("transfermoney");
			atm.getScreen().tranferMoneyStep3Display(name);
			atm.getConnect().setAtmState(new WaitForConformToTransferState(atm));
			
		}

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
		atm.setAmountMoneyToTranfer(num);

	}

	@Override
	public void clickButton2() {
		String num = atm.getAmountMoneyToTranfer() + "2";
		atm.setAmountMoneyToTranfer(num);

	}

	@Override
	public void clickButton3() {
		String num = atm.getAmountMoneyToTranfer() + "3";
		atm.setAmountMoneyToTranfer(num);

	}

	@Override
	public void clickButton4() {
		String num = atm.getAmountMoneyToTranfer() + "4";
		atm.setAmountMoneyToTranfer(num);

	}

	@Override
	public void clickButton5() {
		String num = atm.getAmountMoneyToTranfer() + "5";
		atm.setAmountMoneyToTranfer(num);

	}

	@Override
	public void clickButton6() {
		String num = atm.getAmountMoneyToTranfer() + "6";
		atm.setAmountMoneyToTranfer(num);

	}

	@Override
	public void clickButton7() {
		String num = atm.getAmountMoneyToTranfer() + "7";
		atm.setAmountMoneyToTranfer(num);

	}

	@Override
	public void clickButton8() {
		String num = atm.getAmountMoneyToTranfer() + "8";
		atm.setAmountMoneyToTranfer(num);

	}

	@Override
	public void clickButton9() {
		String num = atm.getAmountMoneyToTranfer() + "9";
		atm.setAmountMoneyToTranfer(num);

	}

	@Override
	public void clickButton0() {
		String num = atm.getAmountMoneyToTranfer() + "0";
		atm.setAmountMoneyToTranfer(num);

	}

}
