import java.util.Scanner;
public class Prime {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int su=scan.nextInt();
		Sosu(su);
	}
	static void Sosu(int s) {
		int i=1;
		int cnt=0;
		do {
			if(s%i==0) {
				cnt++;
				i++;
			}
			else i++;;
		}while(i<=s);

		if(cnt<=2) System.out.print(s+"��(��) �Ҽ��Դϴ�.");  
		else System.out.print(s+"��(��) �Ҽ��� �ƴմϴ�.");
	}
}