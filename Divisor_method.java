import java.util.Scanner;
public class Divisor_method{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("����� ���� �� �Է� : ");
		int su=scan.nextInt();
		System.out.print(su+"�� ��� : ");
		Div(su);	//void�� ���
	}
	static void Div(int s) {	// ������ϱ�
		int i=1;
		do{
			if(s%i==0) System.out.print(i+" ");	
			i++;
		}while(i<=s);
	}
}