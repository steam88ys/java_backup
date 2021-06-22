public class Logical_Test{
	public static void main(String args[]) {
		int a=10;
		System.out.println(a>10 | (a=20)==20); //f
		System.out.println(a); //&& : 10, & : 20 | : 20 || : 10
 		/*int a=10;
		System.out.println((a=20)==20);
		//System.out.println(!a);
		System.out.println(a);

		boolean power=false;
		System.out.println(power); //f
		System.out.println(!power); //t
		System.out.println(!!power); //f*/
	}
}