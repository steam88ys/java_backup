package Class;

import java.util.Scanner;

class Point {
	int x;
	int y;
	
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void moving(int xp, int yp) {
		x += xp;
		y += yp;
	}
	
	void print() {
		System.out.println("점의 위치 : ("+x+", "+y+")");
	}
}

public class MakePointEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.print("x, y좌표 입력 : ");
		Point dot = new Point(scan.nextInt(), scan.nextInt());
		
		dot.print();	// 현재 점 위치 출력
		
		System.out.print("x좌표에서 이동하고 싶은 값 : ");
		int xp = scan.nextInt();
		
		System.out.print("y좌표에서 이동하고 싶은 값 : ");
		int yp = scan.nextInt();
		
		dot.moving(xp, yp);
		
		dot.print();	// 입력 받은 후의 값 출력
		
	}

}
