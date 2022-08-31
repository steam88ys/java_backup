package thread07;

public class BankExam {

	public static Bank mybank = new Bank();
	// mybank는 클래스변수 (전역변수)
	
	public static void main (String[] args) {
		System.out.println("원금: "+mybank.getMoney());
		Family1 f1 = new Family1();	// 스레드 객체 f1 생성
		Family2 f2 = new Family2();	// 스레드 객체 f2 생성
		
		f1.start();	// 스레드 객체 실행
		// Family1클래스의 run()실행
		try {
			Thread.sleep(200);	// 0.2초 실행 지연
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		f2.start();
	
	}

}
