package Model;

public class Acount {
	private String numberOfCard;
	private String numberOfAcount;
	private String name;
	private String pin;
	private int availableBalance;
	private boolean lock;
	public Acount(String numberOfCard, String numberOfAcount, String name, String pin, int availableBalance,
			boolean lock) {
		super();
		this.numberOfCard = numberOfCard;
		this.numberOfAcount = numberOfAcount;
		this.name = name;
		this.pin = pin;
		this.availableBalance = availableBalance;
		this.lock = lock;
	}
	public String getNumberOfCard() {
		return numberOfCard;
	}
	public String getNumberOfAcount() {
		return numberOfAcount;
	}
	public String getName() {
		return name;
	}
	public String getPin() {
		return pin;
	}
	public int getAvailableBalance() {
		return availableBalance;
	}
	public boolean isLock() {
		return lock;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public void setAvailableBalance(int availableBalance) {
		this.availableBalance = availableBalance;
	}
	public void setLock(boolean lock) {
		this.lock = lock;
	}
	
	public boolean checkPin(String pin) {
		return this.pin.equals(pin);
		
	}
	public void lock() {
		lock = true;
	}
	
	

}
