package thread03;

public class Runnable1Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		// 1.Top t = new Top();
		// 2. Thread thd = new Thread(t);
		Thread thd = new Thread( new Top() );	// ���� 1,2 ǥ���� �ѹ������� ǥ��
		
		thd.start();
		System.out.println("���α׷� ����");
	}

}
