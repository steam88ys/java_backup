import java.util.Scanner;
public class ScannerTest1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String addr = sc.nextLine();
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name=sc.nextLine();
		
		System.out.println(name +"����"+" �ּ�"+addr);

		sc.close();
	}
}