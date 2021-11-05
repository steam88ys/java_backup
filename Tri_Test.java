package Class;
import java.util.Scanner;

class Tri {	// default constructor (기본 생성자) -> 아무 생성자가 없을때만 만들어줌
	int bottom;	// 밑변 (멤버변수)
	int height;	// 높이 (멤버변수)
	Tri(){	// t2일때 호출
		System.out.println("기본 생성자");
	}	
	Tri(int bo, int he) {	// 생성자, t2일때 호출
		System.out.println("매개변수 있는 생성자");
		bottom = bo;
		height = he;
	}
	
	double area() {	// 삼각형 넓이 멤버 메서드
		return (double)bottom * height / 2;
	}
	void print() {	// 삼각형 넓이 출력 멤버 메서드 (프린트 메서드)
		System.out.println("밑변이 "+bottom+"이고, 높이가 "+height+"인 삼각형의 넓이 : "+area());
	}
}

public class Tri_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		// 삼각형 1
		Tri t1 = new Tri((int)(Math.random()*10)+1, (int)(Math.random()*10)+1);	// 객체 생성
		// t1.bottom = (int)(Math.random()*10)+1;	// 1~10  //scan.nextInt();
		// t1.height = (int)(Math.random()*10)+1; // scan.nextInt();
		t1.print();	// 프린트 메서드
		
		// 삼각형 2
		Tri t2 = new Tri();	// 객체 생성
		// t2.bottom = (int)(Math.random()*10)+1; //scan.nextInt();
		// t2.height = (int)(Math.random()*10)+1; // scan.nextInt();
		t2.print();	// 프린트 메서드
		
	}

}
