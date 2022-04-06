package Inheritance08;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	// �������̽��� ������ PDAŬ������ SmartPhoneŬ������ ��� �޾ұ� ������
	// �߻�޼ҵ�� ����� ��� �޼ҵ带 ���⿡�� ������(Overriding) �ؾ� �Ѵ�.
	// MobilePhoneInterface�� �߻� �޼ҵ� ����

	@Override
	public void sendCall() {
		System.out.println("������������~~");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��.");
	}
	
	@Override
	public void sendSMS() {
		System.out.println("���ڰ��ϴ�."); 
	}
	
	@Override
	public void receiveSMS() {
		System.out.println("���ڿԾ��."); 
	}
	
	// MP3Interface�� �߻�޼ҵ� ����
	@Override
	public void play() {
	System.out.println("���� �����մϴ�."); 
	}
	
	@Override public void stop() {
		System.out.println("���� �ߴ��մϴ�."); 
	}
	
	// �߰��� �ۼ��� �޼ҵ� 
	public void schedule() {
		System.out.println("���� �����մϴ�."); 
	}
	
}
