package thread01;

public class Thread1Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		Top d = new Top();	// TopŬ������ d ������ ��ü ����
		d.start();	// TopŬ������ �ִ� run()�޼ҵ� ����
		System.out.println("���α׷� ����");
	}

}
