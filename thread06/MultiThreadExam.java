package thread06;

public class MultiThreadExam extends Thread{
	private Summing sum;
	private int num;

	public MultiThreadExam(String s, Summing sum, int num) {	// ������
		super(s);	// ����Ŭ����(Thread)�� �����ڸ� ȣ��. Thread(s)
		// �������� �̸��� ����
		this.sum = sum;	// ��������ϴ� �������� ��ü���� sum ��ü
		this.num = num;	// ��������ϴ� �������� ��ü���� num ��
		System.out.println("������: "+getName()+"�� ���۵�");
	}
	
	public void run() {
		sum.sumTo(num);
		System.out.println("������: "+getName()+"�� �����");
	}
	
	public static void main(String[] args) {
		Summing sum = new Summing();
		MultiThreadExam a = new MultiThreadExam("A", sum, 5);
		MultiThreadExam b = new MultiThreadExam("B", sum, 5);
		a.setPriority(8);	// �켱����
		b.setPriority(10);
		a.start();
		b.start();
	}

}
