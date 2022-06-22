package Exception02;

public class Account {

	private int balance;	// ¿‹∞Ì
	
	public Account() {}	
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("¿‹∞Ì∫Œ¡∑: " + (money-balance) + "∏¿⁄∂˜");
		}
		balance -= money;
	}
	
}
