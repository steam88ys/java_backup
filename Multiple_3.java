import java.util.Scanner;
public class Multiple_3{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num=sc.nextInt();
		System.out.print(num+"��(��) 3�� ���");
		if(num % 3 == 0) //3�� ���
			System.out.print("��");
		else 
			System.out.print("�� �ƴ�");
		System.out.println("�ϴ�.");
	}
}