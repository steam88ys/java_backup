import java.util.Scanner;
public class Salary_Switch_1{
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ��� : ");
		double currentSalary= scan.nextDouble();

		System.out.print("�ٹ��򰡵���� �Է��ϼ��� : ");
		String rating=scan.next();
		
		double newSalary;
		double raise=setRating(rating, currentSalary);
			
		System.out.println("���� �λ�� : "+(int)raise);
		newSalary=currentSalary+raise;
		System.out.print("�� ���� : "+(int)newSalary);
		}
		static double setRating(String rating, double currentSalary) {
			double raise=0.0;	
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
		return raise;	
		}	
	
}