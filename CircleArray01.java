package CircleArray01;

public class CircleArray01 {
	
	public static void main(String[] args) {
		
		Circle[] c;		// 선언
		c = new Circle[5];	// 5개 할당
		
		for (int i = 0; i < c.length; i++)
			c[i] = new Circle(i);
		
		for (int i = 0; i < c.length; i++)
			System.out.print((int) (c[i].getArea()) + " ");
		
	}
}
