import java.util.Scanner;
public class Sum_Money{
	final int a=500, b=700, c=1600;
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("문방구의 이름 : ");
	String mn=scan.next();

	System.out.print("지우개, 연필, 노트 : ");
	int er=scan.nextInt();
	int pe=scan.nextInt();
	int no=scan.nextInt();

	int total=500*er+700*pe+1600*no;
	System.out.println(mn+"문방구에 총지불금액은 "+total+"원입니다.");
	}
} 