package Class;

class Box {
	// 멤버 변수
	int width;
	int height;
	int depth;
	
	int volumn() {	// 부피 계산 메서드
		return width * height * depth;		
	}
	
	int volumn(int t) {	// 부피 계산 메서드, 오버 라이딩
		return width * height * depth * t;		
	}
	
	void print(int times) {	// 부피 출력 메서드
		System.out.println("밑변의 가로 : "+width);	
		System.out.println("밑변의 세로 : "+depth);
		System.out.println("높이 : "+height);
		System.out.println(">>Box의 부피 : "+volumn());
		System.out.println(">>Box의 "+times+"배 부피 : "+volumn(times));
		System.out.println();
	}
}

public class TwoBox {

	public static void main(String[] args) {	// 메서드가 매개변수를 갖지 않는 이유는 생성 단계에서 생성시에 width, height, depth값을 갖게되기 때문
			
		Box Bo1 = new Box();	// 박스 1 기본 생성자
		Bo1.width = 1;
		Bo1.height = 2;
		Bo1.depth = 3;
		
		Box Bo2 = new Box();	// 박스 2 기본 생성자
		Bo2.width = 4;
		Bo2.height = 5;
		Bo2.depth = 6;
		
		Bo1.print(4);			// 1번 박스 부피 출력
		Bo2.print(5);			// 2번 박스 부피 출력
	}

}
