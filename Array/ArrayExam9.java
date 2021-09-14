package Array;

public class ArrayExam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		int [] b;
		int [] c = {31, 32, 33};
		a=new int [4];
		b=new int[] {21, 22, 23, 24};
		System.out.println(a.length +""+b.length +""+c.length);
		c=b;
		System.out.println(a.length +""+b.length +""+c.length);
		System.out.println(c[0]);
	}

}
