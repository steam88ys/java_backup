package thread03;

public class Runnable1Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		Top t = new Top();
		Thread thd = new Thread(t);
		// Thread thd = new Thread( new Top() );
		
		thd.start();
		System.out.println("���α׷� ����");
	}

}
