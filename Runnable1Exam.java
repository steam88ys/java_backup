package thread03;

public class Runnable1Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		// 1.Top t = new Top();
		// 2. Thread thd = new Thread(t);
		Thread thd = new Thread( new Top() );	// 위의 1,2 표현을 한문장으로 표현
		
		thd.start();
		System.out.println("프로그램 종료");
	}

}
