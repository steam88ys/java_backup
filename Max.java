import java.util.Scanner;
public class Max {
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("ù ��° �� �Է� : ");
	int a=scan.nextInt();
	System.out.print("�� ��° �� �Է� : ");
	int b= scan.nextInt();
	if (a>b) {
	System.out.println(a+"�� "+b+"�� ū ���� "+a+"�Դϴ�.");
	}else {
	System.out.println(a+"�� "+b+"�� ū ���� "+b+"�Դϴ�.");
	}

	}
}