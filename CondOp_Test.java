import java.util.Scanner;
public class CondOp_Test {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int c;
		System.out.print("�����Է� : ");
		c=scan.nextInt();
		String b=(c%2==0) ? "¦���Դϴ�." : "Ȧ���Դϴ�." ;
		System.out.println(c+"��(��)"+b);
	}
}