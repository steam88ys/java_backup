import java.util.Scanner;
public class Fact_method{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("n값 입력 : ");
		int n=scan.nextInt();
		System.out.print(n+"! = ");
		int i=1;
		do {
			if(n==i) System.out.print(i);
			else System.out.print(i+"*");
			i++;
		}while(i<=n);
		System.out.print(" = "+fact(n));
	}
	static int fact(int val) {
		if(val==1) return 1;
		else return val*fact(val-1);		//재귀 호출
	}
}