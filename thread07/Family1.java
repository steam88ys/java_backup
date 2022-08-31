package thread07;

public class Family1 extends Thread {
	public void run() {
		BankExam.mybank.saveMoney(5000);
		// 동기화를 하지 않은 mybank객체변수는 특정 스레드 실행 중간에
		// 값이 변경될 수 있다.
		/*
		synchronized (BankExam.mybank) {	// mybank객체변수는 특정스레드가 실행될 때
			//	다른 스레드는 실행불가
			// mybank변수에 lock을 설정
			BankExam.mybank.saveMoney(5000);
			// 클래스 변수 mybank는 BankExam클래스 이름으로 접근 
		}
		*/
		System.out.println("saveMoney(5000): "+BankExam.mybank.getMoney());
	}
	
}
