package package04;

public class RandExam {

	public static void main(String[] args) {

		System.out.println(Math.random());
		System.out.println(Math.random());
		// 0���ٴ� ũ�� 1���ٴ� ���� � �Ǽ���
		
		System.out.println( (int) Math.random() * 5);
		// 1. Math.random() ���� 0���� 1������ ��
		// 2. (int) Math.random()�� �׻� 0�� ��µȴ�.
		// 3. (int) Math.random()*5�� 0*5�̱� ������ ����� �׻� 0�̴�.
		
		System.out.println( (int) (Math.random() * 5));
		// 0 ~ 4 ������ ���� ���
		
		System.out.println( (int) (Math.random() * 10));
		// 0 ~ 9 ������ ���� ���
		
		System.out.println( (int) (Math.random() * 100));
		// 0 ~ 99 ������ ���� ���
		
		System.out.println( (int) (Math.random()*100) + 1);
		// 1 ~ 100 ������ �� ���
		
	}

}
