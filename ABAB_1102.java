import java.util.Scanner;

public class ABAB_1102 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("�� �Է� : ");
		int su = scan.nextInt();
		int[]a = new int[su];
		System.out.print("���� ��� : ");
		for(int i=1; i<=su; i++) {
			if(i%2!=0) System.out.print("A");
			else System.out.print("B");
		}
		
	}

}
