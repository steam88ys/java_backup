import java.util.Scanner;
public class Alpha{
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("���� �Է� : ");
	char c= scan.next().charAt(0);
	char d=(char)(c-32);
	System.out.println("�ҹ��� "+c+"�� �빮�ڴ� "+d+"�Դϴ�.");
	}
}