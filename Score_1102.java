import java.util.Scanner;
public class Score_1102 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		String num, Sname; //�й�, �̸�
		int kor, eng, math, java; //����
		
		System.out.print("�й� : ");
		num=scan.next();

		System.out.print("�̸� : ");
		Sname=scan.next();

		System.out.print("���� : ");
		kor=scan.nextInt();

		System.out.print("���� : ");
		eng=scan.nextInt();

		System.out.print("���� : ");
		math=scan.nextInt();

		System.out.print("�ڹ� : ");
		java=scan.nextInt();
		
		int total=kor+eng+math+java;
		double average=(double)(total)/4;  //���

		System.out.println("\n�հ� : "+total);
		System.out.println("��� : "+average);
		
		//��� A(90�̻�) B(80�̻�) C(70�̻�) D(60�̻�) E(������)
		System.out.print("���� : ");
		switch((int)(average/10)) {
			case 10:
			case 9: System.out.println("A"); break;
			case 8: System.out.println("B"); break;
			case 7: System.out.println("C"); break;
			case 6: System.out.println("D"); break;
			default: System.out.println("E");
		}
	}
}