import java.util.Scanner;

public class Test_16 {

	public static void main(String[] args) {
		
		// 0~100 사이의 정수를 사용자로부터 여러개 입력받아서 합, 평균, 입력 갯수를 출력하시오.
		// 단, 0보다 작은 값이 입력되면 프로그램을 종료하고
		// 100보다 큰 수는 갯수, 합, 평균에서 제외하며 다음 값을 입력 받을 것.
		
		Scanner scan = new Scanner (System.in);
		int su;
		int cnt=0, sum=0;
		
		while(true)
		{		
			System.out.print("0~100 사이의 정수를 입력(음수:종료) : ");
			su= scan.nextInt();
			
			if(su<0) break;
			else if(su>100) continue;
			cnt++;
			sum+=su;
		}
		System.out.print("갯수 : "+cnt+"\n합 : "+sum+"\n평균 : "+(double)sum/cnt);
	}

}
