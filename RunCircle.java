package test.this2;

public class RunCircle {
	
	public static void showPrint(Circle c) {
		
		System.out.printf("�������� %d���� ���� �ѷ��� %.2f��\n", c.getR(), c.getCircum());
		System.out.printf("�������� %d���� ���� ������ %.2f��\n", c.getR(), c.getArea());
		
	}

	public static void main(String[] args) {

		Circle c1 = new Circle(15);
		c1.showInfo();
		Circle c2 = new Circle(6);
		c2.showInfo();
		
	}

}
