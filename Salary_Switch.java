import java.util.Scanner;
public class Salary_Switch{
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ��� : ");
		double currentSalary= scan.nextDouble();

		System.out.print("�ٹ��򰡵���� �Է��ϼ��� : ");
		String rating=scan.next();

		double raise=0.0; 
		double newSalary;
		
		switch (rating){
			case "���": 
				raise=currentSalary*0.06;
				 break;
			case "����": 
				raise=currentSalary*0.04; 
				break;
			case "�ҷ�": 
				raise=currentSalary*0.02 ; 
				break;
		}
		
		System.out.print("���� �λ�� : "+(int)raise);
		
		newSalary=currentSalary+raise;
		System.out.print("�� ���� : "+(int)newSalary);
		
	}
}