import java.util.Scanner;

public class Game_01 {

	public static final int 가위 = 1;
	public static final int 바위 = 2;
	public static final int 보 = 3;
	
	public static void main(String[] args) {

		int com, you;
		Scanner sc  = new Scanner (System.in);
		String choice;
		
		while(true) {
			
			com = (int)(Math.random() * 3) + 1;	// com = 1, 2, 3
			System.out.print("입력(1:가위, 2:바위, 3:보) : ");
			you = sc.nextInt();
			
			//방법1 : 초급자 코스
			/*if(com==1) {	// 컴퓨터 = 가위
				switch(you) {
				case 1: System.out.print("컴퓨터:가위 사용자:가위");
				case 2:
				case 3:
					default:
				}
			}
			else if(com==2) {	// 컴퓨터 = 바위
				
			}
			else if(com==3)	{	//컴퓨터 = 보
				
			}*/
			
			
			//방법2 : 중급자 코스
			/*switch (com) {
				case 1 : 
					System.out.print("컵퓨터:가위\t");
					break;
				case 2 : 
					System.out.print("컵퓨터:바위\t");
					break;
				case 3 : 
					System.out.print("컵퓨터:보\t");
					break;
			}
			
			switch (you) {
				case 1 : 
					System.out.print("사용자:가위\t");
					break;
				case 2 : 
					System.out.print("사용자:바위\t");
					break;
				case 3 : 
					System.out.print("사용자:보\t");
					break;
				default :
					System.out.print("1~3 사이의 숫자만 입력해주세요(종료)");
					System.exit(0);
					break;
			}*/
			
			//방법2-1 : 메서드 이용
			/*if((you==가위 && com==보) || (you==바위 && com==가위) || (you==보 && com==바위) ) {
				System.out.println("사용자가 이겼습니다.");
			}
			else if (you == com) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("컴퓨터가 이겼습니.");
			}*/
			
			
			//방법3: 상급자 코스 you-com
			//방법4: 최상급자 코스 (you-com+3)%3
			System.out.print("컴퓨터: "+print(com));
			System.out.print("사용자: "+print(you));
			
			switch((you-com+3)%3) {
				case 1 :
					System.out.println("사용자가 이겼습니다.");
					break;
				case 2 :
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				case 0 :
					System.out.println("비겼습니다.");
					break;
			}
			
			
			System.out.print("계속하시겠습니까? (y or n) : ");
			choice = sc.next();	// choice = y, n
			
			if(choice.equals("n") || choice.equals("N")) {
				break;
			}
			
			System.out.println();
			
		}
		
			
	}
	
	static public String print(int su) {
		
		String choice = null;
		
		if(su==1) {
			choice = "가위\t\t";
		}
		else if(su==2) {
			choice = "바위\t\t";
		}
		else if(su==3) {
			choice = "보\t\t";
		}
		
		return choice;
				
	}

}
