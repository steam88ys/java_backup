import java.util.Scanner;

public class Number_Game {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int cnt=0;
			int num = (int)(Math.random()*100) + 1;	// 1 ~ 5를 나타내기
//			System.out.println(num);
			
			int su;
			while (true) {
				System.out.print(cnt+1+"번째)"+" 1~100 사이의 정수 입력 : ");
				su=scan.nextInt();
				cnt++;
				
				if (num>su) System.out.println("up");
				else if(num==su) {
					System.out.println("정답입니다.");
					break;
				}
				else System.out.println("down");
				System.out.println();
			}
			
			if (cnt<=4) System.out.print("Great~~~");
			else if (cnt<=8) System.out.print("Good~~~");
			else System.out.print("노력하세요...");
		
		
	}

}
