import java.util.Scanner;
public class yun {
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	int c;
	System.out.print("������ �Է� : ");
	c=scan.nextInt();
	int b=(c>=0) ? c : c*(-1);
	System.out.println(c+"�� ���밪�� "+b );
	
	}
}