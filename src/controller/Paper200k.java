package controller;

import view.AtmMachine;

public class Paper200k extends PaperCurrencyDispenser{
	
	private int numberOfPaper;

	public Paper200k(AtmMachine atmMachine) {
		super(atmMachine);
		numberOfPaper = 20;
	}

	@Override
	public void dispense(PaperCurrency currency) {
		int amount = currency.getAmount();
		int numberOfPaper200k = amount / 200000;
		int remainder=0;
		if (numberOfPaper200k <= numberOfPaper) {
			atmMachine.setMoneyLable2("X"+numberOfPaper200k);
			numberOfPaper = numberOfPaper - numberOfPaper200k;
			remainder = amount % 200000;
			
		}
		else {
			atmMachine.setMoneyLable2("X"+numberOfPaper);
			numberOfPaper = numberOfPaper - numberOfPaper200k;
			remainder = amount - numberOfPaper*200000;
			
		}
		
		if (remainder > 0 && this.nextDispenser != null) {

			this.nextDispenser.dispense(new PaperCurrency(remainder));

		}

		
	}



}
