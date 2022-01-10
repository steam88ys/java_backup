package test.final1;

public class Parent {
//	final 필드는 초기화된 값만 사용할 수 있고 변경이 불가능하다.(필드 값 변경 금지)
	final int REST_TIME = 10;

	public final void rest() {
		System.out.println(REST_TIME + "분간 휴식을 한다.");
	}
	
}
