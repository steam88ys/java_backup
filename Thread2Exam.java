package thread02;

public class Thread2Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		DerivedThread d1 = new DerivedThread();	// d1 ������ ��ü ����
		DerivedThread d2 = new DerivedThread();	// d2 ������ ��ü ����
		
		d1.start();	// d1 ������ ��ü���� run()�޼ҵ� ����
		d2.start();	// d2 ������ ��ü���� run()�޼ҵ� ����
		
		System.out.println("���α׷� ����");
	}

}
