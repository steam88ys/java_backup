import java.util.Scanner;
public class Constant1_1102 {
	public static void main(String args[]) {
		final int S;
		S=85;
		Scanner scan=new Scanner(System.in);
		System.out.print("시험 점수를 입력해 주세요.");
		int c;
		c=scan.nextInt( );
		System.out.println("시험점수 : "+c);
		System.out.print(c+"-"+S+"="+(c-S));
		
	}
}