import java.util.Scanner;
public class For_Test4 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ���� ������ ���� �Է��ϼ��� : ");
		int su=scan.nextInt();
		int s=sum_func(su);
		System.out.println(s);
	}
	static int sum_func(int k){    // return���� ���� int
		int sum=0;
		for(int i=1; i<=k; i++){
			sum+=i;
		}
		return sum;
	}
}

