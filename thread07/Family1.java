package thread07;

public class Family1 extends Thread {
	public void run() {
		BankExam.mybank.saveMoney(5000);
		// ����ȭ�� ���� ���� mybank��ü������ Ư�� ������ ���� �߰���
		// ���� ����� �� �ִ�.
		/*
		synchronized (BankExam.mybank) {	// mybank��ü������ Ư�������尡 ����� ��
			//	�ٸ� ������� ����Ұ�
			// mybank������ lock�� ����
			BankExam.mybank.saveMoney(5000);
			// Ŭ���� ���� mybank�� BankExamŬ���� �̸����� ���� 
		}
		*/
		System.out.println("saveMoney(5000): "+BankExam.mybank.getMoney());
	}
	
}
