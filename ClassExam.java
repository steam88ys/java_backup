package Class;

class Student {
	
	String name;	// 모듬 멤버변수의 접근제어자는 default 이다.
	int grade;		// 따라서 동일한 패키지, 동일 클래스에서만 접근이 가능하다.
	int number;
	private String telephone;
	
	void SetTel (String tel) {	// private 전화번호 넣어주기
		telephone = tel;
	}
	
	String GetTel () {
		return telephone;
	}
	
}

public class ClassExam {

	public static void main(String[] args) {

		Student kim = new Student();	// 생성자는 private일 수 없음
		kim.name = "김현우";
		kim.grade = 2;
		kim.number = 14;
		//	kim.telephone = "123-345-6789";
		kim.SetTel("123-345-6789");
		System.out.println("학생정보 : \t"+kim.name+"\t"+kim.grade+"\t"+kim.number+"\t"+kim.GetTel());
		
	}
	
}

