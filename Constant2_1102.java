import java.util.Scanner;
public class Constant2_1102 {
	public static void main(String args[]) { 
		final double PI;
		PI=3.14;

		Scanner scan=new Scanner(System.in);
		System.out.print("�������� �Է��� �ּ���.");
		int r;
		
		r=scan.nextInt( );
		System.out.println("������ : "+r);
		System.out.println("������"+r+"�� ���� �ѷ� :"+(2*PI*r));
		System.out.println("������"+r+"�� ���� ���� :"+(PI*r*r));
	}
}