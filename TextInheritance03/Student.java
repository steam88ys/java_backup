package TextInheritance03;

public class Student {
	
	// 멤버변수
	String name;
	String hakbun;
	String phone;
	String juso;
	String major;
	
	// 생성자
	public Student() {}
	public Student(String name, String hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}
	
	// 메소드 작성
		void study() {
			System.out.println("공부하다.");
		}
		void eat() {
			System.out.println("식사하다.");
		}
		void test() {
			System.out.println("시험보다.");
		}
		void extra_act() {
			System.out.println("동아리 활동하다.");
		}
	
}
