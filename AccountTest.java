package Class;

class Account {
	
	String account_num;	// 은행계좌번호 멤버변수
	int balance;		// 잔액 멤버변수
	
	void deposit (int money) {	// 입금 메서드
		balance += money;
	}
	
	void withdraw (int money) {	// 출금 메서드
		if(money > balance) {
			System.out.println("잔액이 부족합니다.");
		}
		else balance -= money;
	}
	
}

public class AccountTest {

	public static void main(String[] args) {
		
		Account Ac1 = new Account();	// 생성자
		Ac1.account_num = "101";
		
		System.out.println(Ac1.account_num+" "+Ac1.balance+" ");
			
		Ac1.balance = 5000;
		System.out.println(Ac1.account_num+" "+Ac1.balance+" ");
		
		Ac1.withdraw(2000);
		System.out.println(Ac1.account_num+" "+Ac1.balance+" ");
		
		Ac1.withdraw(3500);
		System.out.println(Ac1.account_num+" "+Ac1.balance+" ");
		
	}

}
