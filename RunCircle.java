package test.class3;

public class RunCircle {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		c1.setR(5);
		
		Circle c2 = new Circle();
		c2.setR(12);
		
		c1.calcCircum();
		c1.calcArea();
		
		c2.calcCircum();
		c2.calcArea();
		
		System.out.println("---------------------------------------");
		System.out.printf("�������� %d���� ���� �ѷ��� %.3f��\n", c1.getR(), c1.getCircum());
		System.out.printf("�������� %d���� ���� ������ %.3f��\n", c1.getR(), c1.getArea());
		System.out.println("---------------------------------------");
		
		System.out.println("---------------------------------------");
		System.out.printf("�������� %d���� ���� �ѷ��� %.3f��\n", c2.getR(), c2.getCircum());
		System.out.printf("�������� %d���� ���� ������ %.3f��\n", c2.getR(), c2.getArea());
		System.out.println("---------------------------------------");
		
	}

}
