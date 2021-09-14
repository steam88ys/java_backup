import java.util.Scanner;
public class Gcd {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int su1=scan.nextInt();
		System.out.print("두번째 수 입력 : ");
		int su2=scan.nextInt();
		Max(su1, su2);
	}
	static void Max(int s1, int s2) {
		int i=1;
		int num=0;
		int small = (s1<s2) ? s1 : s2 ;	//s1이 s2보다 작을때
		int big = (s1>s2) ? s1 : s2 ;	//s1이 s2보다 클때
		do {
			if(num!=0){
				if(num<small) {		//su1
					big=small; System.out.print("b"+big);
					small=num; System.out.print("s"+small);
				
				}
				else {		//1바퀴이상 big 값이 1번 덜바뀜
					big=num;
				}
			}
			num=big-small;
		}while(small!=num);
		System.out.print("최대공약수 : "+num);
	}
}

// if문 반복문 안에 넣어주기, 코드 합치기