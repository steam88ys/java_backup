package thread05;

public class Runnable3Exam {

	public static void main(String[] args) {

		System.out.println("���α׷� ����");
		
		Top t = new Top();
		// Runnable�������̽� ����� ���� ��ü ������
		Thread thd1 = new Thread(t, "a");
		// Thread(t, "a");���� ��ü�� �̿��Ͽ� ������ ��ü�� �����ϰ�
		// ������ �̸��� "a"�� ����
		Thread thd2 = new Thread(t, "b");
		// Thread(t, "b");���� ��ü�� �̿��Ͽ� ������ ��ü�� �����ϰ�
		// ������ �̸��� "b"�� ����
		
		System.out.println(thd1.getPriority());
		// thd1 ������ ��ü�� �켱���� ���. �켱������ �⺻���� 5�� �����Ǿ� �ִ�.
		System.out.println(thd2.getPriority());
		
		thd1.setName("new_a");	// thd1������ ��ü�� �̸��� "new_a"�� ����
		thd2.setName("new_b");	// thd2������ ��ü�� �̸��� "new_b"�� ����
		thd1.setPriority(9);	// thd1������ ��ü�� �켱������ 9�� ����
		thd2.setPriority(thd2.MIN_PRIORITY);	// thd2������ ��ü�� �켱������ 1�� ����
		System.out.println(thd1.getPriority());
		System.out.println(thd2.getPriority());
		
		thd1.start();	// thd1������ ��ü ����
		thd2.start();	// thd2������ ��ü ����
		System.out.println("���α׷� ����");
		
	}

}
