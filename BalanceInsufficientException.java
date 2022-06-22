package Exception02;

// 사용자 예외를 정의할때 Exception클래스를 상속
public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
