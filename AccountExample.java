package Exception02;

public class AccountExample {

	public static void main(String[] args) {

		Account account = new Account();
		// 예급하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		//출금하기
		try {
			account.withdraw(30000);	// 인출
		}catch(BalanceInsufficientException be) {
			String message = be.getMessage();
			// Account 클래스의 BalanceInsufficientException에서 예외가 발생
			// 메세지 : "잔고부족: " + (money-balance) + "모자람"을
			// be.getMessgae();가 가져온다.
			System.out.println(message);
			System.out.println();
			be.printStackTrace();
		}
		
	}

}
