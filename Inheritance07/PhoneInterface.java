package Inheritance07;

public interface PhoneInterface {
	
		// �ڹ� 7����
		final int TIMEOUT = 10000;	// ����ʵ� (�빮�ڷ� ǥ��)
		void sendCall();	// �߻�޼ҵ�
		void receiveCall();	// �߻�޼ҵ�
		
		// �ڹ� 8����
		default void printLogo() {
			// �߻�޼ҵ尡 �ƴ� �Ϲ� �޼ҵ��ε� default�� ���� ��� ���� (���� 8�̻�)
			System.out.println("** Phone **");
		}

}
