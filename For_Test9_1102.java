import java.util.Scanner;
public class For_Test9_1102 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int cnt=1;
		System.out.print("줄 수 입력 ==> ");
		int c=scan.nextInt();
		for(int i=1; i<=c; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(cnt);
				cnt++;
			}
			System.out.println();
		}
	}
}