package package02;

public class ReverseExam {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("java Programming");
		StringBuffer sb2 = null;
		
		sb2 = sb1.reverse();
		// sb1�� ����Ű�� ���ڿ��� �� �������� �����Ѵ�.
		// ���� sb1�� sb2�� ���� ���ڿ��� �ּҸ� ����Ų��.
		System.out.println("sb2=>"+sb2);
		System.out.println("sb1=>"+sb1);
		
	}

}
