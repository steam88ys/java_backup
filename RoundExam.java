package package04;

public class RoundExam {

	public static void main(String[] args) {

		System.out.println(Math.round(25));
		System.out.println(Math.round(25.3));
		System.out.println(Math.round(25.5));	// �ݿø�
		System.out.println(Math.round(-25.4));
		// �Ű����� ���� ���ų� ���� ����� ������ ����
		System.out.println(Math.round(-25.5));	// -25
		System.out.println(Math.round(-25.6));	// -26
		
	}

}
