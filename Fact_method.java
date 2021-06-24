/*
import java.util.Scanner;
public class Fact_method{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=1;
		System.out.print(n+"! = ");
		for(int i=1; i<=n; i++) {
			sum*=i;
			if(i==n) {
				System.out.print(i);
			}
			else {
				System.out.print(i+" * ");
			}
		}
		System.out.print(" = "+sum);
		
	}
}
*/

import java.util.Scanner;
public class Fact_method {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("팩토리얼 계산 수 입력 : ");
		int su=scan.nextInt();
		int s=fact(su);
		System.out.println(s);
	}
	static int fact(int k){    // return값의 형식 int
		int sum=1;
		for(int i=1; i<=k; i++){
			sum*=i;
		}
		return sum;
	}
}

/*
static int fact(int k) {
		int sum=1;
		if(k==1) return 1;
		else return k*fact(k-1);
	}
*/	