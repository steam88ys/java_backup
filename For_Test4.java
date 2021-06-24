import java.util.Scanner;
public class For_Test4 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("합을 구할 마지막 수를 입력하세요 : ");
		int su=scan.nextInt();
		int s=sum_func(su);
		System.out.println(s);
	}
	static int sum_func(int k){    // return값의 형식 int
		int sum=0;
		for(int i=1; i<=k; i++){
			sum+=i;
		}
		return sum;
	}
}

