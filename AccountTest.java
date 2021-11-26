package Class;

class Account {
	
	private int account_num;	// 은행계좌번호 멤버변수
	private int balance;		// 잔액 멤버변수
	static int baseAccNum = 101;	// 클래스 변수	
	
	void deposit (int money) {	// 입금 메서드
		balance += money;
	}
	
	void withdraw (int money) {	// 출금 메서드
		if(money > balance) {
			System.out.println(">> 잔액이 부족합니다");
		}
		else balance -= money;
	}
	
	public String toString () {	// toString
		return "계좌번호 : "+account_num+"\t잔액 : "+balance;	// 문자열 return
	}
	
	Account () {
		account_num = baseAccNum++;
	}
	
}

public class AccountTest {

	public static void main(String[] args) {
		
		System.out.println(Account.baseAccNum);	// 객체 만들기 전에 클래스이름으로 붙여줄 수 있음
		Account Ac1 = new Account();	// 생성자, 계좌1 생성
		System.out.println(Account.baseAccNum);
		System.out.println(Ac1.baseAccNum);
		/*sSystem.out.println(Ac1.toString());
			
		Ac1.balance = 5000;
		System.out.println(Ac1.toString());
		
		Ac1.withdraw(2000);
		System.out.println(Ac1.toString());
		
		Ac1.withdraw(3500);*/
		System.out.println(Ac1.toString());
		
		Account Ac2 = new Account();	// 계좌2 생성
		System.out.println(Account.baseAccNum);
		System.out.println(Ac2.toString());
		
	}

}
