package controller;

import Model.Acount;
import Model.BankData;

import view.AtmMachine;

public class Connection {
	private AtmMachine atmMachine;
	private BankData bankData;
	private Acount currentAcount;
	private Transaction currentTransaction;
	private TransactionFactory transactionFactory;

	public AtmMachine getAtmMachine() {
		return atmMachine;
	}

	public void createTransaction(String name) {
		switch (name) {
		case "balanceinquiry":
			currentTransaction = new BalanceInquiry(atmMachine, currentAcount);
			break;
		case "changepin":
			currentTransaction = new ChangePin(atmMachine, currentAcount, atmMachine.getPin());
			break;
		case "transfermoney":
			int amount = Integer.parseInt(atmMachine.getAmountMoneyToTranfer().replace(",", ""));
			currentTransaction = new TransferMoney(atmMachine, currentAcount, atmMachine.getAcountNumberToTranfer(),amount);
			break;
		case "withdraw":
			
			currentTransaction = new Withdraw(atmMachine, currentAcount, atmMachine.getAmountWithdraw());
			
			break;
		default:
			break;
		}
	}
	
	
	
	public BankData getData() {
		return bankData;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;

	}

	public void setAtmMachine(AtmMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	public BankData getBankData() {
		return bankData;
	}

	public void setBankData(BankData bankData) {
		this.bankData = bankData;
	}

	public Acount getCurrentAcount() {
		return currentAcount;
	}

	public void setCurrentAcount(Acount currentAcount) {
		this.currentAcount = currentAcount;
	}

	public AtmState getAtmState() {
		return atmState;
	}

	public void setAtmState(AtmState atmState) {
		this.atmState = atmState;
	}

	private AtmState atmState;

	public Connection(AtmMachine atmMachine, BankData bankData) {
		super();
		this.atmMachine = atmMachine;
		this.bankData = bankData;
		atmState = new NoCardState(atmMachine);
		//transactionFactory = new TransactionFactory(this.atmMachine, currentAcount);

	}

	public void dial(String name) {
		switch (name) {
		case ENTER:
			atmState.clickEnterButton();
			break;
		case CLEAR:
			atmState.clickClearButton();
			break;
		case CANCEL:
			atmState.clickCancelButton();
			break;
		case VERSION:
			atmState.clickSersionButton();
			break;
		case BILL:
			atmState.clickBillButton();
			break;
		case CASH:
			atmState.clickCashButton();
			break;
		case CARD:
			atmState.clickCardButton();
			break;
		case LEFT1:
			atmState.clickLeft1Button();
			break;
		case LEFT2:
			atmState.clickLeft2Button();
			break;
		case LEFT3:
			atmState.clickLeft3Button();
			break;
		case LEFT4:
			atmState.clickLeft4Button();
			break;
		case RIGHT1:
			atmState.clickRight1Button();
			break;
		case RIGHT2:
			atmState.clickRight2Button();
			break;
		case RIGHT3:
			atmState.clickRight3Button();
			break;
		case RIGHT4:
			atmState.clickRight4Button();
			break;
		case BUTTON0:
			atmState.clickButton0();
			break;
		case BUTTON1:
			atmState.clickButton1();
			break;
		case BUTTON2:
			atmState.clickButton2();
			break;
		case BUTTON3:
			atmState.clickButton3();
			break;
		case BUTTON4:
			atmState.clickButton4();
			break;
		case BUTTON5:
			atmState.clickButton5();
			break;
		case BUTTON6:
			atmState.clickButton6();
			break;
		case BUTTON7:
			atmState.clickButton7();
			break;
		case BUTTON8:
			atmState.clickButton8();
			break;
		case BUTTON9:
			atmState.clickButton9();
			break;
		default:
			break;
		}

	}

	public void connect() {
		String numberOfAcount = atmMachine.getTakeAndReceivePart().getAcountNumber();
		currentAcount = bankData.findAcount(numberOfAcount);
	}

	private static final String ENTER = "enter";
	private static final String CLEAR = "clear";
	private static final String VERSION = "version";
	private static final String BILL = "bill";
	private static final String CARD = "card";
	private static final String CASH = "cash";
	private static final String CANCEL = "canel";
	private static final String LEFT1 = "left1";
	private static final String LEFT2 = "left2";
	private static final String LEFT3 = "left3";
	private static final String LEFT4 = "left4";
	private static final String RIGHT1 = "right1";
	private static final String RIGHT2 = "right2";
	private static final String RIGHT3 = "right3";
	private static final String RIGHT4 = "right4";
	private static final String BUTTON1 = "button1";
	private static final String BUTTON2 = "button2";
	private static final String BUTTON3 = "button3";
	private static final String BUTTON4 = "button4";
	private static final String BUTTON5 = "button5";
	private static final String BUTTON6 = "button6";
	private static final String BUTTON7 = "button7";
	private static final String BUTTON8 = "button8";
	private static final String BUTTON9 = "button9";
	private static final String BUTTON0 = "button0";

}
