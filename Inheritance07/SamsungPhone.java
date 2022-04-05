package Inheritance07;

public class SamsungPhone implements PhoneInterface {
	
	@Override
	public void sendCall() {		// 재정의
		System.out.println("띠리리리링");
	}
	
	@Override
	public void receiveCall() {		// 재정의
		System.out.println("전화가 왔습니다.");
	}
	
	// 일반메소드 작성
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
}
