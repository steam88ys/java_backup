import java.util.Scanner;
public class Next{
	public static void main(String args[]) {
		final int a =10;
		a=15;
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		//String str=sc.next();   //문자열 입력 토큰
		String str=sc.nextLine();  //문자열 입력 라인
		System.out.println(str);
	}
}