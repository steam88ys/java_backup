package Inheritance05;

public class MethodOverridingEx {
	
	static void paint(Shape p) {	// upcasting �� ����Ŭ������ overriding(������)�� �޼ҵ尡 ȣ���
		p.draw();
	}

	public static void main(String[] args) {

		Line line = new Line();	// Line��ü ����
		
		paint(line);			// Shape p = line;
		paint(new Shape());		// ShapeŬ�������� �����ǵ� �޼ҵ尡 ȣ��Ǵ� ��Ȳ.  Shape p = new Shape();
		paint(new Line());		// LineŬ�������� �����ǵ� �޼ҵ尡 ȣ��Ǵ� ��Ȳ.  Shape p = new Line();
		paint(new Rect());		// RectŬ�������� �����ǵ� �޼ҵ尡 ȣ��Ǵ� ��Ȳ.  Shape p = new Rect();
		paint(new Circle());	// CircleŬ�������� �����ǵ� �޼ҵ尡 ȣ��Ǵ� ��Ȳ.  Shape p = new Circle();
		
	}

}
