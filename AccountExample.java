package Exception02;

public class AccountExample {

	public static void main(String[] args) {

		Account account = new Account();
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: " + account.getBalance());
		
		//����ϱ�
		try {
			account.withdraw(30000);	// ����
		}catch(BalanceInsufficientException be) {
			String message = be.getMessage();
			// Account Ŭ������ BalanceInsufficientException���� ���ܰ� �߻�
			// �޼��� : "�ܰ����: " + (money-balance) + "���ڶ�"��
			// be.getMessgae();�� �����´�.
			System.out.println(message);
			System.out.println();
			be.printStackTrace();
		}
		
	}

}
