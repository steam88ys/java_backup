import java.util.Scanner;
public class CondOp_Test {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int c;
		System.out.print("정수입력 : ");
		c=scan.nextInt();
		String b=(c%2==0) ? "짝수입니다." : "홀수입니다." ;
		System.out.println(c+"은(는)"+b);
	}
}