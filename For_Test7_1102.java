import java.util.Scanner;
public class For_Test7_1102 {
	public static void main(String args[]) {
		int al=90;
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자를 입력하시오.");
		int num=scan.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((char)al);
				if(j<i) --al;
			}
			al=90;
			System.out.println();
		}
	}
}
//90 65 --