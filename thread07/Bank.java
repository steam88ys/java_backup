package thread07;

public class Bank {
	private int money = 10000;

	public int getMoney() {		return money;	}
	public void setMoney(int money) {	this.money = money;	}
	
	public void saveMoney(int save) {	// save = 5000
		int m = this.getMoney();	// 10000
		try {
			Thread.sleep(500);	// 0.5초 실행지연
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.setMoney(m+save);	// 10000+5000 = 15000 -> money에 저장
	}
	
	public void minusMoney(int minus) {	// minus = 2000
		int m = this.getMoney();	// m = 15000
		try {
			Thread.sleep(500);	// 0.5초 실행지연
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.setMoney(m-minus);	// 15000-2000=13000 -> money에 저장
	}
	
}
