package TextInheritance03;

public class Leader extends Student{

	// �������
	boolean boss;
		
	// ������
	public Leader(String name, String hakbun, boolean boss) {
		super(name, hakbun);	// StudentŬ�������� ����
		this.boss = boss;
	}
		
	// �޼ҵ�
	void isLeader() {
		if(boss) 	// boss�� true�̸� ���� ����
			System.out.println(name+"�� �б�ȸ���̴�.");
		else		// boss�� false�̸� ���� ����
			System.out.println(name+"�� �б�ȸ���� �ƴϴ�.");
	}
	
}
