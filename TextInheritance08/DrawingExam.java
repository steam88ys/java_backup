package TextInheritance08;

public class DrawingExam {

	public static void main(String[] args) {

		Circle c = new Circle();	// c��ü ����
		c.draw();					// CircleŬ������ �ִ� draw() ȣ��
		c.painting();				// CircleŬ������ �ִ� painting() ȣ��
		
		Shape s = new Shape();	// s�� ShapeŬ������ �ִ� �͸� ����
		s.draw();		// ShapeŬ������ �մ� draw() ȣ��
		// s.painting();	--> �����߻�
		
		s = c;	// Upcasting
		s.draw();	
		// CircleŬ������ ��ĳ������ �߱� ������
		// ShapeŬ�������ִ� draw()�޼ҵ带 ȣ������ �ʰ�
		// CircleŬ������ �ִ� draw()�޼ҵ� ȣ��
		// s.painting(); --> ���� ������ ����Ŭ������ Shape���� ���ǰ� �Ǿ� ���� ����
		
	}

}
