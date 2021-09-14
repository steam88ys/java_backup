import java.util.Scanner;
public class WhileScore{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int sum=0, cnt=-1;
		double avg=0;
		int su=1;
		while(su!=0) {
			System.out.print("점수 입력 : ");
			su=scan.nextInt();
			cnt++;
			sum+=su;
		}
		avg=(double)sum/cnt;
		System.out.println("점수의 합 : "+sum);
		System.out.print("점수의 평균 : "+avg);
	}
}