import java.util.Scanner;
public class Sum_Money{
	final int a=500, b=700, c=1600;
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("���汸�� �̸� : ");
	String mn=scan.next();

	System.out.print("���찳, ����, ��Ʈ : ");
	int er=scan.nextInt();
	int pe=scan.nextInt();
	int no=scan.nextInt();

	int total=500*er+700*pe+1600*no;
	System.out.println(mn+"���汸�� �����ұݾ��� "+total+"���Դϴ�.");
	}
} 