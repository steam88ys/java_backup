import java.util.Scanner;
public class Alpha{
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("문자 입력 : ");
	char c= scan.next().charAt(0);
	char d=(char)(c-32);
	System.out.println("소문자 "+c+"의 대문자는 "+d+"입니다.");
	}
}