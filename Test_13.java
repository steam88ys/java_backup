import java.util.Scanner;

public class Test_13 {

	public static void main(String[] args) {
		
		// 1~100 사이의 숫자중 3의 배수이면서, 5의 배수인 수를 출력하고
		// 그 갯수와 총 합을 출력하시오
		// for문을 이용할 것.
		
		int cnt=0, sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
				cnt++;
				sum+=i;
			}
		}
		System.out.println();
		System.out.print("갯수 : " + cnt + "\n총 합 : " + sum);
		
	}

}
