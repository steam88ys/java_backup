import java.util.Scanner;
public class SwitchExam5{
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int a= scan.nextInt();

		switch(a) {
			case 1 : case 2 : 
				System.out.println("���̵�����Ʈ�����"); break;
			case 3 : case 4 : 
				System.out.println("���̵�����ַ�ǰ�"); break;
			case 5 : case 6 : 
				System.out.println("���̵������ΰ�"); break;
			default : System.out.println("�Էµ� ���� �������� �ʽ��ϴ�."); break;
		}

	}
}