package thread07;

public class BankExam {

	public static Bank mybank = new Bank();
	// mybank�� Ŭ�������� (��������)
	
	public static void main (String[] args) {
		System.out.println("����: "+mybank.getMoney());
		Family1 f1 = new Family1();	// ������ ��ü f1 ����
		Family2 f2 = new Family2();	// ������ ��ü f2 ����
		
		f1.start();	// ������ ��ü ����
		// Family1Ŭ������ run()����
		try {
			Thread.sleep(200);	// 0.2�� ���� ����
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		f2.start();
	
	}

}
