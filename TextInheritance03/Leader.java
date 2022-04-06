package TextInheritance03;

public class Leader extends Student{

	// 멤버변수
	boolean boss;
		
	// 생성자
	public Leader(String name, String hakbun, boolean boss) {
		super(name, hakbun);	// Student클래스에서 실행
		this.boss = boss;
	}
		
	// 메소드
	void isLeader() {
		if(boss) 	// boss가 true이면 다음 문장
			System.out.println(name+"은 학급회장이다.");
		else		// boss가 false이면 다음 문장
			System.out.println(name+"은 학급회장이 아니다.");
	}
	
}
