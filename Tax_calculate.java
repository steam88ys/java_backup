import java.util.Scanner;
public class Tax_calculate{
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
		System.out.print("±Ù·Î¼Òµæ : ");
		int salary=scan.nextInt();
	
		System.out.print("¼Òµæ¼¼ : ");
		if(salary <= 2000) 		System.out.println((int)(0.05*salary));
		else if(salary <= 4000) 	System.out.println((int)(0.15*salary));
		else if(salary <= 8000) 	System.out.println((int)(0.25*salary));
		else 			System.out.println((int)(0.40*salary));
	}
}