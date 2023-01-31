package controller;

import view.AtmMachine;

public class Paper500k extends PaperCurrencyDispenser {
	public Paper500k(AtmMachine atmMachine) {
		super(atmMachine);
		numberOfPaper = 20;
	}

	private int numberOfPaper;

	@Override
	public void dispense(PaperCurrency currency) {
		int amount = currency.getAmount();
		int numberOfPaper500k = amount / 500000;
		int remainder=0;
		if (numberOfPaper500k <= numberOfPaper) {
			atmMachine.setMoneyLable1("X"+numberOfPaper500k);
			numberOfPaper = numberOfPaper - numberOfPaper500k;
			remainder = amount % 500000;
			
		}
		else {
			atmMachine.setMoneyLable1("X"+numberOfPaper);
			numberOfPaper = numberOfPaper - numberOfPaper500k;
			remainder = amount - numberOfPaper*500000;
			
		}
		
		if (remainder > 0 && this.nextDispenser != null) {

			this.nextDispenser.dispense(new PaperCurrency(remainder));

		}

	}

}
