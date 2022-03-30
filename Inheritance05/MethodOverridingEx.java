package Inheritance05;

public class MethodOverridingEx {
	
	static void paint(Shape p) {	// upcasting 된 하위클래스의 overriding(재정의)된 메소드가 호출됨
		p.draw();
	}

	public static void main(String[] args) {

		Line line = new Line();	// Line객체 생성
		
		paint(line);			// Shape p = line;
		paint(new Shape());		// Shape클래스에서 재정의된 메소드가 호출되는 상황.  Shape p = new Shape();
		paint(new Line());		// Line클래스에서 재정의된 메소드가 호출되는 상황.  Shape p = new Line();
		paint(new Rect());		// Rect클래스에서 재정의된 메소드가 호출되는 상황.  Shape p = new Rect();
		paint(new Circle());	// Circle클래스에서 재정의된 메소드가 호출되는 상황.  Shape p = new Circle();
		
	}

}
