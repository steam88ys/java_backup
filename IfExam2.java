import java.util.Scanner;
public class IfExam2 {
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);

	int a=scan.nextInt(); 
	char op=scan.next().charAt(0);
	int b=scan.nextInt(); 
	
	if(op =='+') System.out.println(a + " + " +b+ " = " + (a+b) );
	else if( op =='-' ) System.out.println( a + " - " +b+ " = " + (a-b) );
	else if( op =='*' ) System.out.println(a+ " * " +b+ " = " + (a*b) );
	else if( op =='/' ) System.out.println( a + " / " +b+ " = " + (a/b) );
	else if( op =='%' ) System.out.println( a + " % " +b+ " = " + (a%b) );
	else System.out.println("��������ڰ� �ƴմϴ�.");
	}
}