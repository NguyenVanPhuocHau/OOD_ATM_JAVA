package controller;

import view.AtmMachine;

public class Paper100k extends PaperCurrencyDispenser {

	private int numberOfPaper;

	public Paper100k(AtmMachine atmMachine) {
		super(atmMachine);
		numberOfPaper = 20;
	}

	@Override
	public void dispense(PaperCurrency currency) {
		int amount = currency.getAmount();

		int numberOfPaper100k = amount / 100000;

		int remainder = 0;
		if (numberOfPaper100k <= numberOfPaper) {
			atmMachine.setMoneyLable3("X" + numberOfPaper100k);
			numberOfPaper = numberOfPaper - numberOfPaper100k;
			remainder = amount % 100000;
		} else {
			atmMachine.setMoneyLable3("X" + numberOfPaper);
			numberOfPaper = numberOfPaper - numberOfPaper100k;
			remainder = amount - numberOfPaper * 100000;

		}

		if (remainder > 0 && this.nextDispenser != null) {

			this.nextDispenser.dispense(new PaperCurrency(remainder));

		}
	}

}
