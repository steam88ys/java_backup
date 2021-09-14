import java.util.Scanner;
public class Salary_Switch{
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
		System.out.print("현 연봉을 입력하세요 : ");
		double currentSalary= scan.nextDouble();

		System.out.print("근무평가등급을 입력하세요 : ");
		String rating=scan.next();

		double raise=0.0; 
		double newSalary;
		
		switch (rating){
			case "우수": 
				raise=currentSalary*0.06;
				 break;
			case "보통": 
				raise=currentSalary*0.04; 
				break;
			case "불량": 
				raise=currentSalary*0.02 ; 
				break;
		}
		
		System.out.print("연봉 인상액 : "+(int)raise);
		
		newSalary=currentSalary+raise;
		System.out.print("새 연봉 : "+(int)newSalary);
		
	}
}