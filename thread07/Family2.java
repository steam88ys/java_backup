package thread07;

public class Family2 extends Thread {
	public void run() {
		BankExam.mybank.minusMoney(2000);
		/*
		synchronized (BankExam.mybank) {
			BankExam.mybank.minusMoney(2000);
		}
		*/
		System.out.println("minusMoney(2000): "+BankExam.mybank.getMoney());
	}
}
