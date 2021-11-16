import java.util.Scanner;

public class Quiz_RockScissorsPaper {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int computer;
		while(true) {
			System.out.print("다음중 하나 선택하세요 (1:가위 2:바위 3:보) >> ");
			int su = scan.nextInt();
			computer = (int)(Math.random()*3) + 1;
			System.out.println("컴퓨터 : "+computer+"  당신 : "+su);
			if((computer == 1 && su == 2) || (computer == 2 && su ==3) || (computer == 3 && su == 1)) System.out.println("당신이 이겼습니다.");
			else if(computer == su) System.out.println("당신과 컴퓨터는 비겼습니다.");
			else System.out.println("컴퓨터가 이겼습니다.");
			
			System.out.print("계속 하시겠습니까? (Y/N) >> ");
			String keep = scan.next();
			char kep = keep.charAt(0);
			if((int)kep == 78) break;
		}
		System.err.println(">> 게임이 종료되었습니다.");
		
	}

}
