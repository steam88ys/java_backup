import java.util.Scanner;
public class Constant2_1102 {
	public static void main(String args[]) { 
		final double PI;
		PI=3.14;

		Scanner scan=new Scanner(System.in);
		System.out.print("반지름을 입력해 주세요.");
		int r;
		
		r=scan.nextInt( );
		System.out.println("반지름 : "+r);
		System.out.println("반지름"+r+"인 원의 둘레 :"+(2*PI*r));
		System.out.println("반지름"+r+"인 원의 넓이 :"+(PI*r*r));
	}
}