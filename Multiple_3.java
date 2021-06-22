import java.util.Scanner;
public class Multiple_3{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=sc.nextInt();
		System.out.print(num+"은(는) 3의 배수");
		if(num % 3 == 0) //3의 배수
			System.out.print("입");
		else 
			System.out.print("가 아닙");
		System.out.println("니다.");
	}
}