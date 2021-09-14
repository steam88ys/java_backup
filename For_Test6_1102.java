import java.util.Scanner;
public class For_Test6_1102 {
	public static void main(String args[]) {
		int alpha=65;
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력 ==> ");
		char C=scan.next().charAt(0);
		for(int i=1; i<=C-96; i++) {
			for(int j=1; j<=i+i-1; j++) {
				System.out.print((char)alpha);
			}
			alpha++;
			System.out.println();
		}
	}
}


/* 
67
		
65			1	1    2씩증가
66 66 66			2	3
67 67 67 67 67 		3	5
*/