package controller;

import view.AtmMachine;

public abstract class PaperCurrencyDispenser {
	protected PaperCurrencyDispenser nextDispenser;
	protected AtmMachine atmMachine;
	

	public PaperCurrencyDispenser(AtmMachine atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}

	public void setNextDispenser(PaperCurrencyDispenser nextDispenser) {

		this.nextDispenser = nextDispenser;

	}

	public abstract void dispense(PaperCurrency currency);

}
