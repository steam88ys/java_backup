import java.util.Scanner;
public class ScannerTest1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주소를 입력하세요 : ");
		String addr = sc.nextLine();
		
		System.out.print("이름을 입력하세요 : ");
		String name=sc.nextLine();
		
		System.out.println(name +"님의"+" 주소"+addr);

		sc.close();
	}
}