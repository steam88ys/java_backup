import java.util.Scanner;

public class Test_15 {

	public static void main(String[] args) {
		/*
		// while문을 이용해서 1부터 누적합계가 100이 넘는 첫번쨰 수와 그때까지의 합계를 출력하시오.
		int su =0;
		int sum=0;
		while(true) {
			su++;
			if(sum>100) break;
			sum+=su;
			// sum+= ++i;
		}
		System.out.println("첫번째 수 : "+(su-1)+", 누적 합계 : "+sum);
		*/
		
		// while문을 이용해서 약수 구하기
		Scanner scan = new Scanner (System.in);
		System.out.print("정수 입력 : ");
		int su = scan.nextInt();
		
		int weaksu=1;
		while(weaksu<=su) {
			if(su%weaksu==0) {
				System.out.print(weaksu+" ");
			}
			weaksu++;
		}
		
		
	}

}
