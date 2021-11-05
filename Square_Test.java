package Class;

import java.util.Scanner;

class Square {	// 멤버 변수 -> 가로, 세로
	int width ;	// 가로
	int length;	// 세로
	void Sqr (int wid, int leng) {
		width = wid;
		length = leng;
	}
	int area() {	// 넓이
		return width * length;
	}
	int circu() {	// 둘레
		return (width + length) * 2;
	}
	void print() {	// 삼각형 넓이 출력 멤버 메서드 (프린트 메서드)
		System.out.println("가로가 "+width+"이고, 세로가 "+length+"인 사각형\n넓이 : "+area()+", 둘레 : "+circu());
	}
}

public class Square_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("가로길이 입력 : ");
		int wid = scan.nextInt();
		System.out.print("세로길이 입력 : ");
		int leng = scan.nextInt();
		
		Square s1= new Square();
		s1.width = wid;
		s1.length = leng;
		
		s1.print();
		
	}

}
