import java.util.Scanner;
public class if2_1102 {
	public static void main(String args[]) {
		Scanner scan=new Scanner (System.in);
		System.out.println("������ ������ �Է��ϼ���.");
		System.out.print("SUM(0), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) : ");
		int a=scan.nextInt();
		switch(a) {
			case 0 :System.out.println("������ SUNDAY�Դϴ�."); break;
			case 1 :System.out.println("������ MONDAY�Դϴ�."); break;
			case 2 :System.out.println("������ TUESDAY�Դϴ�."); break;
			case 3 :System.out.println("������ WEDNESDAY�Դϴ�."); break;
			case 4 :System.out.println("������ THURSDAY�Դϴ�."); break;
			case 5:System.out.println("������ FRIDAY�Դϴ�."); break;
			case 6:System.out.println("������ SATURDAY�Դϴ�."); break;
			default : System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");

		}


	
	}
}