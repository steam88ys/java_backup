import java.util.Scanner;
public class if1_1102 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("����(1), ����(2), ��(3) �Է�: ");
		
		int a=scan.nextInt();

		switch(a) {
			case 1: System.out.println("����� ������ ���̽��ϴ�."); break;
			case 2: System.out.println("����� ������ ���̽��ϴ�."); break;
			case 3: System.out.println("����� ���� ���̽��ϴ�."); break;
	  		default: System.out.println("�߸� ���̽��ϴ�.");
		}

	}
}