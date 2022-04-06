package TextInheritance04;

public class CircleMainTest extends CircleArea_Exam{

	public static void main(String[] args) {

		CircleArea_Exam cp = new CircleArea_Exam();
		
		//System.out.println("원의 면적은 " + cp.area(10));
		// area()메소드가 private로 되어 있기 때문에 해당 클랫 내에서만 사용
		System.out.println("원의 둘레는 " + cp.round(10));
		// protected로 선언된 메소드는 상속관계에서 접근 가능하고,
		// 같은 패키지에 있어도 접근 가능
		
	}

}
