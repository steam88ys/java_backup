import java.util.Scanner;
public class Divisor_method{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("약수를 구할 수 입력 : ");
		int su=scan.nextInt();
		System.out.print(su+"의 약수 : ");
		Div(su);	//void일 경우
	}
	static void Div(int s) {	// 약수구하기
		int i=1;
		do{
			if(s%i==0) System.out.print(i+" ");	
			i++;
		}while(i<=s);
	}
}