package package04;

public class TestExam {

	public static void main(String[] args) {

		// �ֻ���(1~6)�� 10�� ������
		// 1�� ���� ������ 500���� �ް�, 
		// 2�� ���� ������ 1000���� �ް�, 
		// 3�� ���� ������ 1500���� �ް�, 
		// 4�� ���� ������ 2000���� �ް�, 
		// 5�� ���� ������ 2500���� �ް�, 
		// 6�� ���� ������ 3000���� ���� ��
		// ��ü �ݾ��� ���ΰ�
		
		int total = 0;	// ��ü �ݾ�
		int dice = 0;	// ���� �߻��� ������ ����
		
		for(int i = 0; i<10; i++) {
			dice = (int) (Math.random()*6)+1;
			System.out.println((i+1)+"��: " + dice);
			total += dice * 500;
		}
		
		System.out.println("\n��ü �ݾ� : "+total);
		
		
	}

}
