import java.util.Scanner;
public class SwitchExam2 {
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�(���� ������ ���̴� ������ �� ��) : ");
		int a=scan.nextInt(); 
		char op=scan.next().charAt(0);
		int b=scan.nextInt(); 
		
		switch (op) {
			case '+' : System.out.println( a+" + "+b+" = "+(a+b) ); break;
			case '-' : System.out.println( a+" - "+b+" = "+(a-b) ); break;
			case '*' : System.out.println( a+" * "+b+" = "+(a*b) ); break;
			case '/' : System.out.println( a+" / "+b+" = "+(a/b) ); break;
			case '%' : System.out.println( a+" % "+b+" = "+(a%b) ); break;
			default : System.out.println( "��Ģ�����ڰ� �ƴմϴ�." );
		}
	}
}