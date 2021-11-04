package Class;

class Tri {
	int bottom;	// 밑변 (멤버변수)
	int height;	// 높이 (멤버변수)
	
	double area() {	// 삼각형 넓이 메서드
		return (double)bottom * height / 2;
	}
}

public class Tri_Test {

	public static void main(String[] args) {
		
		Tri t1 = new Tri();	// 객체 생성
		t1.bottom = 3;
		t1.height = 5;
		System.out.println(t1.area());
		
	}

}
