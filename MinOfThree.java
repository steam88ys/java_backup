import java.util.Scanner;
public class MinOfThree{
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	
	System.out.print("ù ��° �� �Է� : ");
	int a=scan.nextInt();
	System.out.print("�� ��° �� �Է� : ");
	int b=scan.nextInt();
	System.out.print("�� ��° �� �Է� : ");
	int c=scan.nextInt();
	
	int m;

	if(a<b)
		if(a<c) m=a;
		else m=c;
	else
		if(b>c) m=b;
		else m=c;
	
	System.out.println(a+"�� "+b+"�� "+c+"�� ���� ���� ���� "+m+"�Դϴ�.");
	}
}
