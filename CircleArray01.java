package CircleArray01;

public class CircleArray01 {
	
	public static void main(String[] args) {
		
		Circle[] c;		// ����
		c = new Circle[5];	// 5�� �Ҵ�
		
		for (int i = 0; i < c.length; i++)
			c[i] = new Circle(i);
		
		for (int i = 0; i < c.length; i++)
			System.out.print((int) (c[i].getArea()) + " ");
		
	}
}
